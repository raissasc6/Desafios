import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import AlunoComponent from './components/AlunoComponent';
import ListaAlunoComponent from './components/ListaAlunoComponent';
import * as serviceWorker from './serviceWorker';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import AlunoUpdateComponent from './components/AlunoUpdateComponent';

ReactDOM.render(
  <div>
    <Router>
        <HeaderComponent></HeaderComponent>
        <div className="container">
          <Switch>
            <Route path ="/" exact component  = {ListaAlunoComponent}></Route>
            <Route path ="/alunos" component = {ListaAlunoComponent}></Route>
            <Route path ="/novo" component = {AlunoComponent}></Route>
            <Route path ="/aluno/:id" component = {AlunoUpdateComponent}></Route>
          </Switch>
        </div>
        <FooterComponent></FooterComponent>
    </Router>
  </div>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
