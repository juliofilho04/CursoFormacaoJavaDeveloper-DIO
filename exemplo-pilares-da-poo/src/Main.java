public class Main {
    public static void main(String [] args) {
        Cliente nome = new Cliente();
        nome.setNome("Júlio");

        Conta cc = new ContaCorrente(nome);
        Conta cp = new ContaPoupanca(nome);

        cc.depositar(200);
        cc.transferir(100, cp);
        cc.sacar(100);

        ((ContaCorrente) cc).imprimirExtrato();
        ((ContaPoupanca) cp).imprimirExtrato();
    }
    
}
