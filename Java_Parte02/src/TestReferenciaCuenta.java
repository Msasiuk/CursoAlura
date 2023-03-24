
public class TestReferenciaCuenta {

	public static void main(String[] args) {
		Cuenta cuenta01 = new Cuenta();
		Cuenta cuenta02 = cuenta01;
		
		cuenta01.saldo = 200;
		cuenta02.saldo = 100;
		
		System.out.println("Valor cuenta01 " + cuenta01.saldo + 
				"\n Valor cuenta02 " + cuenta02.saldo);
		
		if(cuenta01 == cuenta02) {
			System.out.println("Son el mismo objeto");
		}
		

	}

}
