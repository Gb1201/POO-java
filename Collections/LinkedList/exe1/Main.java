package POO_java.Collections.LinkedList.exe1;

public class Main {

    public static void main(String[] args) {
        Turma turma= new Turma("Engenharia de Software");

        Aluno aluno1= new Aluno("Gabriel", 20);
        Aluno aluno2= new Aluno("Benina", 8);
        Aluno aluno3= new Aluno("Benjamim", 7);
        Aluno aluno4= new Aluno("Noah", 5);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.adicionarAluno(aluno4);

        turma.listarAlunos();

        turma.removerAluno(aluno2);

        System.out.println("====================Lista Atualizada==========================");

        turma.listarAlunos();


        System.out.println("=========================Adicionando de novo o aluno removido==============");
        turma.adicionarAlunoNaPosicao(1, aluno2);
        turma.listarAlunos();
        
    }
    
}
