import React, { Component } from 'react';
import et2 from "./et2.png";


class HeaderComponent extends Component{
  constructor(props){
      super(props)

      this.state={
          alunos:[]
      }
    }

      render(){
        return(
      <div class="container">
        <header>
        <nav class="navbar  navbar-expand-lg navbar-dark scrolling-navbar">
          <a class="navbar-brand mx-auto" href="/alunos">
            <img src={et2} width="50" 
            class="d-inline-block topo"  alt="alien"/>
            <h1 class="topo">Desafio_</h1>
          </a>
        </nav>

        </header>
      </div>
   )
  }
  
  
}  
  export default HeaderComponent
  