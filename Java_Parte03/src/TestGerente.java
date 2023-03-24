
public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente01 = new Gerente();
		gerente01.setSalario(5000);
		System.out.println("Salario gerente: " + gerente01.getSalario());
		System.out.println("Bonificacion gerente: " + gerente01.getBonificacion());
	
		gerente01.setClave("AluraCursosOnLine");
		System.out.println(gerente01.iniciarSesion("AluraCursosOnLine"));
	}

}
