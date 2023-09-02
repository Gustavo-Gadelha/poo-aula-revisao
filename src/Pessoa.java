public class Pessoa {
    String nome;
    String cpf;

    static int quantidadeDePessoas;

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        Pessoa.quantidadeDePessoas += 1;
    }

    public void digaOi() {
        System.out.println(this.nome + " disse oi");
    }
}
