import axios from 'axios';

const ALUNO_API_URL = "http://localhost:8080/aluno/";

class AlunoService{

    getAlunos(){
        return axios.get(ALUNO_API_URL+"all");
    }

    getAluno(id){
        return axios.get(ALUNO_API_URL+id);
    }

    updateAluno(aluno){
        return axios.put(ALUNO_API_URL+"update/",aluno);
    }

    createAluno(aluno){
        return axios.post(ALUNO_API_URL+"salvar",aluno);
    }

    delAluno(id){
        return axios.delete(ALUNO_API_URL+"delete/"+id);
    }


}

export default new AlunoService()