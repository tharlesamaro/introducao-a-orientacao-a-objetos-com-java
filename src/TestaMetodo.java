
public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoTharles = new Conta();
        contaDoTharles.saldo = 100;
        contaDoTharles.deposita(50);
        System.out.println(contaDoTharles.saldo);

        boolean conseguiuRetirar = contaDoTharles.saca(20);
        System.out.println(contaDoTharles.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaThayna = new Conta();
        contaDaThayna.deposita(1000);

        contaDaThayna.transfere(300, contaDoTharles);

        System.out.println(contaDaThayna.saldo);
        System.out.println(contaDoTharles.saldo);
    }

}
