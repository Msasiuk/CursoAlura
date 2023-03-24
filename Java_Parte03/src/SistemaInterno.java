//Usuarios que autenticarán en sistema
public class SistemaInterno {
	
	private String clave = "AluraCursosOnLine";
	
	public boolean autentica(Autenticable autenticable) {
		boolean puedeIniciarSesion = autenticable.iniciarSesion(clave);
		
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
