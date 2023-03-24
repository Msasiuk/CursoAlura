
public class TestReferenciaCliente {
	public static void main(String[] args) {
	Cliente diego = new Cliente();
	diego.nombre = "Diego";
	diego.documento = "45444332";
	diego.telefono = "999922222";
	
	Cuenta cuentaDiego = new Cuenta();
	cuentaDiego.saldo = 1000;
	cuentaDiego.titular = diego; 
	
	//Al acceder al titular de la cuenta, puedo acceder a los atributos de titular
	System.out.println("El documento del titular de la cuenta diego es: " +
						cuentaDiego.titular.documento);
	System.out.println("Dirección de memoria de cuentaDiego.titular" +
			cuentaDiego.titular +
			"\n Dirección de memoria de diego como Cliente" +
			diego);
	}
	/*Tienen la misma dirección de memoria LOS OBJETOS EN JAVA SE MANEJAN
	 * POR REFERENCIA, por valor se manejan los tipos primitivos*/
}
