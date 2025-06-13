import java.util.LinkedList;

public class Gestao { // essa gestão seria pra adicionar aluno e professor em cada turma 

    private LinkedList<Aluno> alunos= new LinkedList<>();
    private LinkedList<Professor> professores= new LinkedList<>();
    private LinkedList<Turma> turmas= new LinkedList<>();


    public Gestao(){} // construtor vazio

    // metodo auxiliar pra adicionar um aluno

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    // mesma coisa com Professor 

    public void adicionarProfessor(Professor prof){
        professores.add(prof);
    }


    //adicionar uma turma

    public void adicionarTurmas(Turma turma){
        turmas.add(turma);

    } 
}
