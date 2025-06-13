
// nesse projeto usaremos o LinkedList
public class Aluno {

    private String nome;
    private int idade;
    private String numero_matricula;


    public Aluno(String nome, int idade, String numero_matricula) {
        this.nome = nome;
        this.idade = idade;
        this.numero_matricula = numero_matricula;
    }


    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public String getNumero_matricula() {
        return numero_matricula;
    }

    

}
