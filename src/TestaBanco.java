
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente tharles = new Cliente();
		tharles.nome = "Tharles Amaro";
		tharles.cpf = "999.999.999-99";
		tharles.profissao = "estudante";
		
		Conta contaDoTharles = new Conta();
		contaDoTharles.deposita(100);
		
		contaDoTharles.setTitular(tharles);
		
		System.out.println(contaDoTharles.getTitular().nome);

	}

}
