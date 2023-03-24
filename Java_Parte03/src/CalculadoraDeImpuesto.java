
public class CalculadoraDeImpuesto {
	private double totalImpuesto;
	
	public void registra(Tributacion tributacion) {
		double valor = tributacion.getValorImpuesto();
		this.totalImpuesto += valor;
	}
	
	public double getTotalImpuesto() {
		return totalImpuesto;
	}
}
