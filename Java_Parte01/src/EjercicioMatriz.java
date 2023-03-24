public class EjercicioMatriz {
	public static void main(String[] args) {
		
		for(int fila = 0; fila <= 10; fila ++) {
		
			for(int columna = 0; columna <= 10; columna++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
				
		for(int fila = 0; fila <= 10; fila ++) {
			// break en condición
			for(int columna = 0; columna < fila; columna++) {			
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		for(int fila = 0; fila <= 10; fila ++) {
			
			for(int columna = 0; columna <= 10; columna++) {
				if(columna > fila) {
					break; //break fuera de condición, rompe el ciclo de columna y salta a la siguiente fila
				}
			
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
	}
}
