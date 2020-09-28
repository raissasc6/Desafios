import React, { Component } from 'react';


class FooterComponent extends Component{
  constructor(props){
      super(props)

      this.state={
          alunos:[]
      }
    }

      render(){
        return(
        <footer class="page-footer font-small blue">
          <div class="footer-copyright text-center py-3">© 2020 Desafio 2:
             Raissa Cunha
          </div>
        </footer>
   )
  }
  
  
}  
  export default FooterComponent
  