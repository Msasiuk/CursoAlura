/* Clase empleado general, la volvemos ABSTRACTA ya que no describe 
 * un cargo real de la empresa, eso hace que no pueda ser instanciada de 
 * forma directa pero si puede seguir siendo heredada*/
public abstract class Funcionario {
	
	private String nombre, documento;
	private double salario;
	//private int tipo;
	
	//Método constructor del mismo tipo de retorno de la clase
	public Funcionario() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/*public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}*/
	
	/*Método abstracto permite crear un método sin cuerpo, un método que no puede ser 
	 * ejecutado en la clase padre pero que debe ser implementado por sus hijos,
	 * Crea una obligación a todos sus hijos que deben implementar sus métodos abstractos, 
	 * salvo que el hijo sea abstracto en ese caso ya no debe implementar los métodos abstractos
	 * de su padre pero tampoco podrá tener instancias de si mismo*/
	public abstract double getBonificacion();

}
