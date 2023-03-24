// Clase con método main
public class CrearCuenta {

	public static void main(String[] args) {
		Cuenta primeraCuenta;
		primeraCuenta = new Cuenta();
		
		/* Declaracion de variable y referencia del objeto Cuenta en misma línea.
		   Los objetos trabajan por referencia y no por valor
		   
		   VER CLASE TEST REFERENCIA
		   Las variables de datos primitivos trabajan por valor y no por referencia.
		*/
		Cuenta segundaCuenta = new Cuenta(); 
		
		//primeraCuenta.saldo = 1000; // Atravez del punto se llama al atributo del objeto instaciado
		primeraCuenta.depositar(1000);
		//segundaCuenta.saldo = 500;
		segundaCuenta.depositar(500);
		
		System.out.println(primeraCuenta.agencia);
		System.out.println(segundaCuenta.titular);
	}

}
