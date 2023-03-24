
public class TestTributacion {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(222, 333);
		cc.depositar(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraDeImpuesto calculadora = new CalculadoraDeImpuesto();
		
		calculadora.registra(cc);
		calculadora.registra(seguro);

		System.out.println(calculadora.getTotalImpuesto());
	}

}
