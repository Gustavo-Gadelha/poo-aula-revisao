public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", "000.000.000-00");
        Pessoa p2 = new Pessoa("João", "111.111.111-11");
        Pessoa p3 = new Pessoa("Maria", "222.222.222-22");

        ContaBancaria conta1 = new ContaBancaria(p1);
        ContaBancaria conta2 = new ContaBancaria(p2);

        conta1.depositar(1000);
        conta1.transferePara(conta2, 500);
        System.out.println("Saldo da conta1: " + conta1.saldo);
        System.out.println("Saldo da conta2: " + conta2.saldo);
        conta1.exibirHistorico();

    }
}