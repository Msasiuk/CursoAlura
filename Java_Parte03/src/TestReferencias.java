
public class TestReferencias {

	public static void main(String[] args) {
		/*El elemento más generico referencia a objeto más específico,
		 * A esto se le llama Polimorfismo, ya que todos los Gerentes son Funcionarios*/
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		/*Pero alreves no se puede ya que no todos los Funcionarios son Gerentes
		 * El siguiente código no compila --> Gerente gerente = new Funcionario();*/
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);

		gerente.iniciarSesion("dd");
		/*A pesar del polimorfismo no se pueden usar atributos/metodos que no se encuentren en elemento más general.
		 * Pero si los que se encuentran en el objeto general incluso aquellos sobreescritos. 
		 * funcionario.iniciarSesion("dd");*/
		
	}

}
