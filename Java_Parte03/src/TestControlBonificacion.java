public class TestControlBonificacion {
	public static void main(String[] args) {
		//Polimorfismo Funcionario se volvio clase abstracta
		Funcionario funcionario = new Contador();
		funcionario.setSalario(2000);
		
		Gerente gerente = new Gerente();
		gerente.setSalario(10000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
				
		Contador contador = new Contador();
		contador.setSalario(5000);
		
		/*Aquí funciona el polimorfismom ya que gerente y contador son funcionarios
		 * El método original --> registrarSalario(Funcionario funcionario) 
		 * Y así evitar generar caso por cada tipo Gerente, Contador, Diseñador, etc*/
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(gerente);
		controlBonificacion.registrarSalario(contador);
		
		
	}
}
