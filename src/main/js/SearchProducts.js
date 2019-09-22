const React = require('react');


class SearchProducts extends React.Component {

    constructor(props) {
        super(props);
          this.state = {
            products :[ ]
      
          };
      }
    
   

       render(){

                return (<div className="container">
                        
                        <form className="form-inline">
  
  <div className="form-group mx-sm-3 mb-2">
    <label for="inputPassword2" class="sr-only">Enter product name here</label>
    <input type="text" className="form-control" id="inputPassword2" placeholder="Type product name here"/>
  </div>
  <button type="button" className="btn btn-primary mb-2">Search Products</button>
</form>
                          
                       
    </div>);


       }



}
module.exports = SearchProducts;