public class ContaCorrente extends Conta{
	
	// Construtor
	public ContaCorrente(Cliente cliente){
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}// class