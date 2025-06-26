package aplicacao;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.nomeTitular = "Ana";
        conta1.saldo = 0;
        conta1.depositar(100);
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta1.nomeTitular);
        System.out.println("SALDO: " + conta1.saldo);

        Conta c2 = new Conta();
        c2.saldo = 1000;
        c2.nomeTitular = "Eduardo";
        c2.depositar(5000);
        if (c2.sacar(10000)){
            System.out.println("Saque efetuado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + c2.nomeTitular);
        System.out.println("SALDO: " + c2.saldo);

    }
}