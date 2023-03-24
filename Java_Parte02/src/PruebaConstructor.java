
public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(55);
		cuenta.setAgencia(-2);
		
		System.out.println(cuenta.getAgencia());
		
		Cuenta cuenta2 = new Cuenta(44);
		Cuenta cuent3 = new Cuenta(20);
		
		System.out.println(Cuenta.getContadorCuentas());		

	}

}
