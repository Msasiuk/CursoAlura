public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(200);		
		/*Método retirar impide que se retire dinero si el saldo de la cuenta es insuficiente*/
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		
		/*Cuendo el atributo saldo no está encapsulado permite acceder directamente a el y 
		 * hacer cosas que por ejemplo el método retirar no me permite*/
		
		//cuenta.saldo -= 300;
		System.out.println(cuenta.getSaldo());
		
		cuenta.setAgencia(-22);
		System.out.println(cuenta.getAgencia());
	}
}
