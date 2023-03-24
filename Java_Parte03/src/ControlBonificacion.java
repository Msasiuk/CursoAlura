
public class ControlBonificacion {
	
	private double suma;
	
	// Registra bonificaciones de cada funcionario
	public double registrarSalario(Funcionario funcionario) {
		this.suma += funcionario.getBonificacion();
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	
}
