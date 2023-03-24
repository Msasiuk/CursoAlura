
public class TestFuncionario {

	public static void main(String[] args) {
		//Polimorfismo Funcionario se volvio clase abstracta
		Funcionario funcionario01 = new Contador();
		funcionario01.setNombre("Diego");
		funcionario01.setDocumento("444556665");
		funcionario01.setSalario(2000);
		//funcionario01.setTipo(0);
		
		//Imprimo salario del empleado
		System.out.println("Salario funcionario: " + funcionario01.getSalario());
		
		//Imprimo bonificación del empleado
		System.out.println("Bonificacion funcionario: " + funcionario01.getBonificacion());
		
		//Polimorfismo Funcionario se volvio clase abstracta
		Funcionario gerente01 = new Gerente();
		gerente01.setSalario(5000);
		//gerente01.setTipo(1);
		System.out.println("Salario gerente: " + gerente01.getSalario());
		System.out.println("Bonificacion gerente: " + gerente01.getBonificacion());
	}

}
