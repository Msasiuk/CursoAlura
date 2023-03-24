public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("asdf35ca");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		/*Al igual que se puede acceder a un atributo de un objeto que se encuentra en otro objeto.
		 * Tambien se puede acceder a método de un objeto que se encuentra en otro objeto.
		 */
		//cuenta.titular.nombre si los atributos no fueran privados
		System.out.println(cuenta.getTitular().getNombre());
		
	}
}
