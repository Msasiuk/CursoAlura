public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		
		//Saldo es atributo de objeto cuenta
		miCuenta.saldo = 300;
		
		//Depositar es método de objeto cuenta
		miCuenta.depositar(200);
		
		/*La diferencia es que al atributo se le setea directamente el valor
		 * mientras que el método funciona con parametros pasados, aunque pueden
		 * existir métodos que no reciban parametros pero igual se colocan los () vacios*/
		
		System.out.println("El saldo de mi cuenta luego de depositar 200 es de: " 
							+ miCuenta.saldo);
		
		
		miCuenta.retirar(400);
		System.out.println("El saldo de mi cuenta luego de retirar 400 es: "
					 		+ miCuenta.saldo);
		
		Cuenta cuentaAjena = new Cuenta();
		cuentaAjena.depositar(1000);
		
		boolean puedeTransferir = cuentaAjena.transferir(400, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("Tranferencia exitosa");
		}else {
			System.out.println("No pudo realizarse la transferencia");
		}

		
		System.out.println("El saldo de mi cuenta luego de transferir de cuenta ajena es de: "
							+ miCuenta.saldo);
		System.out.println("El saldo de cuenta ajena luego de trasnferir es de: "
				+ cuentaAjena.saldo);
				
	}
}
