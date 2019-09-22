const React = require('react');

const CategorySection = require('./CategorySection.js');
const SearchProducts = require('./SearchProducts.js');

class ProductDisplay extends React.Component {

    constructor(props) {
        super(props);
          this.state = {
            products :[ ]
      
          };
      }
    componentDidMount (){
        var self = this;
        console.log("Mounint");

        setInterval(()=>{
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function (e) {
                 
                if (this.readyState == 4 && this.status == 200) {
                    console.log("Setting state");
                    self.setState({products : JSON.parse(this.responseText).products});
                 }
                
            };
            xhttp.open("GET", "/products", true);
            xhttp.send();


        }, 1000);



        
}



    updateState(productsList) {
          console.log("updating state");
        this.setState({products : productsList});
    }
   

       render(){

                return (<div className="container">
                        <SearchProducts/>
                        
                        {
                           
                            this.state.products.map(product=>{
                           
                              return ( <CategorySection key={product.category} name={product.category} products={product.list}/>)
                           
                        })}
                       
                </div>);


       }



}
module.exports = ProductDisplay;