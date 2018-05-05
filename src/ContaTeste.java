
public class ContaTeste {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        primeiraConta.deposita(100);

        Conta segundaConta = new Conta();
        segundaConta.deposita(50);

        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
    }
}
