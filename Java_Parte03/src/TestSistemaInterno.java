
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente = new Gerente();
		Administrador administrador = new Administrador();
		
		
		gerente.setClave("AluraCursosOnLine");
		administrador.setClave("1234");
		
		/*No larga error ya que el método usa Interfaz Autenticable.
		 * Gerente y administrador implementan de el*/
		sistema.autentica(gerente);
		sistema.autentica(administrador);
	}
}
