
public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.setSaldo(300);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.deposita(100);

        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }

}
