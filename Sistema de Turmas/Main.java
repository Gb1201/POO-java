import java.util.Scanner;

public class Main {

    public static Scanner entrada= new Scanner(System.in);

    public void cadastroAluno(String nome, int idade, String numero_matricula){
        System.out.println("Digite o nome do aluno: ");
        nome= entrada.nextLine();

        System.out.println("Digite a idade do aluno: ");
        idade=entrada.nextInt();

        System.out.println("Digite o numero de matrícula do aluno: ");
        numero_matricula= entrada.nextLine();

    }

    
    
}
