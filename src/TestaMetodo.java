
public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoTharles = new Conta();
        contaDoTharles.setSaldo(100);
        contaDoTharles.deposita(50);
        System.out.println(contaDoTharles.getSaldo());

        boolean conseguiuRetirar = contaDoTharles.saca(20);
        System.out.println(contaDoTharles.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaThayna = new Conta();
        contaDaThayna.deposita(1000);

        contaDaThayna.transfere(300, contaDoTharles);

        System.out.println(contaDaThayna.getSaldo());
        System.out.println(contaDoTharles.getSaldo());
    }

}
