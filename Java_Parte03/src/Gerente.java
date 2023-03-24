/*Clase gerente de banco que extiende/hereda atributos y métodos de clase funcionario
 * Gerente ES UN TIPO de Funcionario */

/*Java solo permite heredar de un sólo padre, no permmite herencia multiple,
 * 
 * */
public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;

	/*Composición de objetos, un objeto dentro de otro*/
	public Gerente() {
		this.util = new AutenticacionUtil();
	}
	
	//Con super accedemos a los métodos de la clase padre
	//SOBREESCRITURA de métodos: cuando la clase hija usa el mismo nombre su clase padre 
	//Gerente reciben bonificacion del 100% del salario + bonificacion de funcionario
	@Override
	public double getBonificacion() {
		System.out.println("Desde clase Gerente");
		//return super.getSalario() + (super.getSalario() * 0.1);
		return super.getSalario() + this.getSalario()*0.5;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
}
