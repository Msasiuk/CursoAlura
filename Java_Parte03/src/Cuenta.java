public abstract class Cuenta{
	//Con protected la variable se vuelve publica para sus clases hijas y clases del mismo paquete
	protected double saldo;
	private int agencia, numero; 
	private Cliente titular = new Cliente();
	
	private static int contadorCuentas = 0;
	
	public static int getContadorCuentas() {
		return Cuenta.contadorCuentas;
	}
		
	public Cuenta(int agencia, int numero) {
		if(agencia <= 0) {
			System.out.println("Número de agencia menor o igual a 0, se asignará valor 1");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		
		this.numero = numero;
		contadorCuentas++;
		System.out.println("Número de cuenta: " + contadorCuentas);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estaán permitos valores negativos");
		}
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public abstract void depositar(double valor); 
	
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;	
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.retirar(valor);
			//cuenta.saldo += valor;
			cuenta.depositar(valor);
			return true;
		} 
		return false;		
	}
}