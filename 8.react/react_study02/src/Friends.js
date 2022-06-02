import React from 'react';

function Friends(props){
    return(
        <div>
            <h3>{props.name}</h3>
            <h2>{props.sex}</h2>
            <h2>{props.email}</h2>
        </div>
    );

}

export {Friends}  ;
// import React from 'react'

// import React, { Component } from 'react'

// export default class Friends extends Component {
//   render() {
//     return (
//       <div>      <h3>{this.props.name}</h3>
//       <h2>{this.props.sex}</h2>
//       <h2>{this.props.email}</h2></div>
//     )
//   }
// }
