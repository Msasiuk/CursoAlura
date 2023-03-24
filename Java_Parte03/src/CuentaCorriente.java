
public class CuentaCorriente extends Cuenta implements Tributacion{

	/* Ya que constructor padre pide datos agencia y número, otra opción 
	 * es crear un constructor vacio pero va en contra del constructor de cuerta */
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;		
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
}
