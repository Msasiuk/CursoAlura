public class EjericiosVarios {
	public static void main(String[] args) {
		
		System.out.println("Son mútiplos de tres: ");
		for(int i = 0; i <= 100; i++) {
		    if(i % 3 == 0 && i != 0) {
				System.out.print(i + " ");
			}
			if(i % 12 == 0) {
				System.out.println(""); //Imprime un saldo de línea cada 4 multiplos
			}
		}
		
		System.out.println("");
		int factorial = 1;
		for(int i = 0; i <= 10; i++) {
			factorial *= i+1;
			System.out.println("El factorial de " + i + " es : " + factorial);			
		}
		
	}
}
