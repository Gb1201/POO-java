package POO_java.Collections.LinkedList.exe1;

import java.util.LinkedList;

public class Turma {

    private String nomeTurma;
    private LinkedList<Aluno> alunos= new LinkedList<>();


    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno: alunos){
            System.out.println("Nome: "+aluno.getNome()+", idade: "+aluno.getIdade());
        }
    }
    

}
    

