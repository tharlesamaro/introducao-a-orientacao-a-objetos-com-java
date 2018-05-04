
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoTharles = new Conta();
		contaDoTharles.saldo = 100;
		contaDoTharles.deposita(50);
		System.out.println(contaDoTharles.saldo);	

	}

}
