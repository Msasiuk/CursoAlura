public class Condicionales {
	public static void main(String[] args) {
		// Atajo de System.out.println() : sysout --> ctrl + space + enter
		System.out.println();

		int edad = 10;
		boolean estaAcompaniado = true;
		boolean puedeEntrar;

		/*
		 * Se puede obviar la llave del if, pero solo tendrá por válida la primera linea
		 * luego del if El resto de las lineas se interpretaran fuera del condicional if
		 */

		// Y --> &&
		// O --> ||

		if (edad >= 18 || estaAcompaniado == true) {
			System.out.println("Es mayor de edad o esta acompañado");
			puedeEntrar = true;
		} else if (edad < 18) {
			System.out.println("Es menor de edad y no esta acompañado");
			puedeEntrar = false;
		} else {
			System.out.println("Otro");
			puedeEntrar = false;
		}

		if (puedeEntrar) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("No puede entrar");
		}

		/* Condicional switch se usa para evaluar una condicion que puede dar varios resultados
		 * Y para la cual deberíamos usar muchos si anidados*/
		int mes = 12;

		switch (mes) {
		case 1:
			System.out.println("El mes es enero");
			break;
		case 2:
			System.out.println("El mes es febrero");
			break;
		case 3:
			System.out.println("El mes es marzo");
			break;
		case 4:
			System.out.println("El mes es abril");
			break;
		case 5:
			System.out.println("El mes es mayo");
			break;
		case 6:
			System.out.println("El mes es junio");
			break;
		case 7:
			System.out.println("El mes es julio");
			break;
		case 8:
			System.out.println("El mes es agosto");
			break;
		case 9:
			System.out.println("El mes es septiembre");
			break;
		case 10:
			System.out.println("El mes es octubre");
			break;
		case 11:
			System.out.println("El mes es noviembre");
			break;
		case 12:
			System.out.println("El mes es diciembre");
			break;
		default:
			System.out.println("Mes inválido");
			break;
		}
	}
}
