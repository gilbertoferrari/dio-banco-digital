public class Main {
	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao Banco!");
		// Criar o cliente
		Cliente cliente1 = new Cliente();
		// set nome do cliente
		cliente1.setNome("Gilberto");
		
		Conta cc= new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
		
		// deposita 100 na conta corrente
		cc.depositar(100);		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		// transferi da cc para poupanca
		cc.transferir(50 , poupanca);
		// imprimir extratos atualizados
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}// main
}// class