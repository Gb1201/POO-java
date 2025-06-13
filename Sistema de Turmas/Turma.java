public class Turma {

    private int id;
    private static int proximo_id=0; // coemca com 0
    private String nome_escola;


    public Turma(String nome_escola) {
        this.id = proximo_id++;
        this.nome_escola = nome_escola;
    }

    public int getId() {
        return id;
    }


    public String getNome_escola() {
        return nome_escola;
    }


}
