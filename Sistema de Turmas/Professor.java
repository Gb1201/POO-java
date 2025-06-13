public class Professor {

    private String nome;
    private int idade;
    private Disciplinas materia_que_ensina;


    public Professor(String nome, int idade, Disciplinas materia_que_ensina) {
        this.nome = nome;
        this.idade = idade;
        this.materia_que_ensina = materia_que_ensina;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }
    
    public Disciplinas getMateria_que_ensina() {
        return materia_que_ensina;
    }
    
    
    
}
