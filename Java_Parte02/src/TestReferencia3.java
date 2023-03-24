
public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta();
		//Cliente diego = new Cliente();
		//cuentaDiego.titular = new Cliente(); Se optimiza la creación de Cliente
		cuentaDiego.titular.nombre = "Diego";
		
		System.out.println(cuentaDiego.titular.nombre);
		/*Este código da error "java.lang.NullPointerException"
		 * ya que no se inicializó el Cliente en la cuenta 
		 * y por ello o existe ni siquiera como null, null
		 * seria cuando lo inicializamos y no le damos valor
		 * para ello el atributo Cliente en Cuenta debería ser 
		 * Cliente titular = new Cliente() y así lo inicializamos y queda en null*/
	}

}
