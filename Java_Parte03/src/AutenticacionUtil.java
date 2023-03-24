/*Clase que tendrá métodos en común de varias clases que ya tienen padre
 * y no pueden heredar otra clase, y en las cuales la interfaz solo
 * les brinda métodos pero estos no se encuentran implementados y 
 * a los cuales también les falta agregar atributos para esos métodos*/

/*Clase que sirve como composición de objetos --> un objeto dentro de otro*/
public class AutenticacionUtil {
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
