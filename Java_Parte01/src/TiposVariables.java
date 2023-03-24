import java.util.Scanner;

public class TiposVariables {
	public static void main(String[] args) {
		/* byte, short, int, long, double, float, char, boolean son tipos de datos. JAVA es fuertemente tipado 
		por lo que debo decirle de que tipo es la variable al declararla.
		 */
		
		// Operadores aritmeticos:  +  -  *  / 
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un valor para número 1");
		int numero1 = leer.nextInt();
		
		// Una de los dos debe ser double para no truncar el resultado, por más que el resultado sea double
		System.out.println("Ingrese un valor para número 2");
		double numero2 = leer.nextInt();
		
		double resultadoDivision = numero1/numero2;
		
		System.out.println("La división entre " + numero1 + " y " + numero2 + " es: " + resultadoDivision);	
		
		/* byte soporta 8 bits - 2 elevado a la 7,
		 * short soporta 2 elevado a la 15,
		 * int soporta 2 elevado a la 31, 
		 * long soporta 2 elevado a la 63 
		*/
		byte numByte = 127;
		short numShort = 32767;
		int numeroInt = 2147483647;
		long numLong = 922337203700000000L;
	
		// Float soporta decimales como double, pero es más pequeño
		float numeroFloat = 127.7F;
		
		/* Para que un tipo de variable soporte uno mayor debe castearse, pero se eliminarán 
		 * info en el proceso, por ejemplo al castear un double en un int se pierden los decimales ya 
		 * que trunca el resultado */
		int numCasteado = (int)resultadoDivision;
		
		/* char no soporta valor vacio ni más de dos caracteres a la vez, debe usarse comilla simple.
		 * String soporta valor vacio y tambien más de un valor de la tabla ASCII, debe usarse comilla doble.
		 * String no es un tipo de dato primitivo sino que en JAVA es un objeto y por ello tiene sus propios métodos.
		*/
		
		char caracter1 = 'A';
		char caracter2 = 65; // Valor A en tabla ASCII
		char caracter3 = (char) (caracter2 + 1);
		String cadenaDeTexto = "A";
	
		
		System.out.println("char 1 = " + caracter1 + "\n char 2 = " + caracter2 +
				 "\n char 3 = " + caracter3  + "\n string = " + cadenaDeTexto);
		
		boolean valorVerdadero = true;
		boolean valorFalso = false;
	}
}
