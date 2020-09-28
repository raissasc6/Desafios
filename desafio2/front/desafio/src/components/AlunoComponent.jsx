import React, { Component } from 'react';
import AlunoService from '../services/AlunoService';


class AlunoComponent extends Component{
  constructor(props){
      super(props)

      this.state={
        nome_aluno:'',
        idade_aluno:0
      }

      this.changeNome = this.changeNome.bind(this);
      this.changeIdade = this.changeIdade.bind(this);
      this.salvaAluno = this.salvaAluno.bind(this);
  }

  salvaAluno  = (e)=>{
    e.preventDefault();
    let aluno = {nome_aluno: this.state.nome_aluno, idade_aluno: this.state.idade_aluno};
    //console.log('alunos: '+ JSON.stringify(aluno));
    AlunoService.createAluno(aluno).then(res =>{
      this.props.history.push('/alunos');
    });
  }

  changeNome = (event) =>{
      this.setState({nome_aluno: event.target.value});
  }

  changeIdade= (event) =>{
    this.setState({idade_aluno: event.target.value});
  }

  cancel(){
    this.props.history.push('/alunos');
  }

  render(){
      return(
      <div class="container bg-gray">
        <form>
          <h2>Cadastro de novo aluno</h2>
            <div class="form-group">
              <label for="nome">Nome:</label>
              <input type="text" name="nome"  className="form-control" id="nome" placeholder="Nome"
               value={this.state.nome_aluno} onChange={this.changeNome} />
            </div>
            <div class="form-group">
              <label for="idade">Idade</label>
              <input type="number" class="form-control" id="idade" placeholder="0"
              value={this.state.idade_aluno} onChange={this.changeIdade} />
            </div>
        </form>
        <div class="btn-group align-center" role="group" aria-label="buttons groups">
          <button type="button" class="btn btn-outline-danger" onClick={this.salvaAluno} >Salvar</button>
          <button type="button" class="btn btn-outline-primary" onClick={this.cancel.bind(this)}>Cancelar</button>
            
        </div>  
      </div>
 )
}
}


export default AlunoComponent

