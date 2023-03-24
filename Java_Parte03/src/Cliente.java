/*La Interfaz se implementa no se hereda*/
public class Cliente implements Autenticable{
	
	private String nombre, documento, telefono;
	private AutenticacionUtil util;

	/*Composición de objetos, un objeto dentro de otro*/
	public Cliente() {
		this.util = new AutenticacionUtil();
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
