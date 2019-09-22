const React = require('react')

class Product extends React.Component {


       render(){

                return (<div className="col-lg-2">

                    
                    
                     <div className="card" style={{width: 18 +'em'}}>
                               <img src="..." className="card-img-top" alt="..."/>
                     <div className="card-body">
                      <h5 className="card-title"> {this.props.name}</h5>
                       <p className="card-text">Price : $ {this.props.price}</p>
                       <a href="#" className="btn btn-primary">Buy Now</a>
                     </div>
                     </div>


                </div>);


       }



}
module.exports = Product;