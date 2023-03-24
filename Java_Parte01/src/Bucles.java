
public class Bucles {
	public static void main(String[] args) {
		/* bucle WHILE debe declararse por fuera del scope del bucle una variable contador y luego 
		 * incrementarla o decrementarla dentro del bucle para no hacer un bucle infinito, 
		 * se usa más para condiciones booleanas y para cuando quiero ocupar la variable 
		 * creada fuera, ya que en el for la variable creada en la condición no es accesible desde fuera
		*/
		int contador = 0;
		while(contador <= 10) {
			System.out.print(" Numero " + contador);
			contador += 1;
		}
		System.out.println("");
		
		/*Bucle FOR se usa cuando se cuantas veces debe iterar, en la condición
		 * se declara la variable contador, su límite y su cantidad de incremento o decremento*/
		
		for(int x = 0; x <= 10 ; x++) {
			System.out.print(" Numero " + x);
		}
		System.out.println("");
		
		int sumaTotal = 0;
		for(int x = 1; x <= 10 ; x++) {
			sumaTotal += x; // Guarda en variable y la suma de todos los valores de x
		}
		
		
		System.out.println("La suma de todos los numeros del 1 al 10 da: " + sumaTotal);
		
		
		/* Matriz creada con bucle for donde x indica el número a multiplicar e
		 * y indica el número que multiplica
		*/
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				System.out.print(x + " x " + y + " = " + (x*y) + " ");
			}
			System.out.println("");
		}
		
	}
}
