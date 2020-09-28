import React, { Component } from 'react';
import AlunoService from '../services/AlunoService';


class ListaAlunoComponent extends Component{
    constructor(props){
        super(props)

        this.state={
            alunos:[]

        }
        this.addAluno = this.addAluno.bind(this);
        this.updateAluno = this.updateAluno.bind(this);
        this.delAluno = this.delAluno.bind(this);
    }

    componentDidMount(){
        AlunoService.getAlunos().then((res)=> {
            this.setState({alunos: res.data});
        });
    }

    addAluno(){
        this.props.history.push('/novo');
      }
    
    updateAluno(id){
        this.props.history.push(`/aluno/${id}`);
    }  

    delAluno(id){
        AlunoService.delAluno(id)
        window.location.reload(); 
    }

    render(){
        return(
            <div class="component">
                <h2>Lista de AL<b>ien</b>UNOS</h2>
                <button type="button" class="btn btn-secondary" onClick={this.addAluno}>Novo Aluno</button>
                <table class="table table-striped table-hover table-dark">
                    <thead>
                        <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Idade</th>
                        <th scope="col">Opções</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.alunos.map(
                                aluno =>
                                <tr key = {aluno.id_aluno}>
                                    <th scope="row">{aluno.id_aluno}</th>
                                    <td>{aluno.nome_aluno}</td>
                                    <td>{aluno.idade_aluno}</td>
                                        <td><div class="btn-group" role="group" aria-label="Basic example">
                                            <button type="button" class="btn btn-light"
                                            onClick={()=> this.updateAluno(aluno.id_aluno)}>Editar</button>
                                            <button type="button" class="btn btn-danger"
                                            onClick={()=> this.delAluno(aluno.id_aluno)}>Excluir</button>
                                        </div>
                                    </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
                
            </div>
        )
    }
}


export default ListaAlunoComponent
