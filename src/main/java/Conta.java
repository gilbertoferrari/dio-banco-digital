public abstract class Conta implements IConta{
	
	// atributos
	private  static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected  Cliente cliente;
	
	public Conta(Cliente cliente){
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
		
	@Override
	public void sacar(double valor) {
		// retira o valor do saldo atual
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// adiciona o valor no saldo atual
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// retirar o valor do saldo da conta
		this.sacar(valor);
		// deposita o valor na contaDestino
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns(){
		System.out.println(String.format("Titular : %s" , this.cliente.getNome()));
		System.out.println(String.format("Agencia : %d" , this.agencia));
		System.out.println(String.format("Numero : %d" , this.numero));
		System.out.println(String.format("Saldo : %.2f" , this.saldo));
	}
	
	// getters
	public int getAgencia(){
		return agencia;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
}// class