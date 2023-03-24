/*Clase Contador de banco que extiende/hereda atributos y métodos de clase funcionario
 *Contador ES UN TIPO de Funcionario */
public class Contador extends Funcionario{

	@Override
	public double getBonificacion() {
		System.out.println("Desde clase Contador");
		return 200;
	}
	

}
