const React = require('react');
const ReactDOM = require('react-dom');
const MenuBar = require('./MenuBar.js');
const ProductDisplay = require('./ProductDisplay.js');


 class App extends React.Component {

     render(){

         return ( 
             <div>
            <MenuBar/>
            <ProductDisplay/>
            </div>
  );

     }


     

  }
  ReactDOM.render(<App/>, document.getElementById('root'));