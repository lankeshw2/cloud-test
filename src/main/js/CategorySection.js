const React = require('react');

const Product = require('./Product.js');

class CategorySection extends React.Component {


       render(){

                return (<div className="container">
                    
                     <div className="bg-secondary container btn btn-primary"  data-toggle="collapse" data-target={"#"+this.props.name.replace(" ", "_")} aria-expanded="false" aria-controls={this.props.name}>
                     {this.props.name}
  </div>
  
                     <div className="collapse row" id={this.props.name.replace(" ", "_")}>
                    {this.props.products.map(product => {
                        return <Product key={product.name} name={product.name} price={product.price} />
                    })}
                    </div>
                    

                </div>);


       }



}
module.exports = CategorySection;