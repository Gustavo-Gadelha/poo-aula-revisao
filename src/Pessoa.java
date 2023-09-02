import java.util.ArrayList;

public class Pessoa {
    public String nome;
    public String cpf;
    public static int quantidadeDePessoas;
    public static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        Pessoa.quantidadeDePessoas += 1;
        Pessoa.listaDePessoas.add(this);
    }

    public void digaOi() {
        System.out.println(this.nome + " disse oi");
    }
}
