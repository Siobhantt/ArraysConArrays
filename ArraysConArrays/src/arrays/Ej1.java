package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
	/*
	 * Crea un programa que pida al usuario dos valores N y M y luego cree un array
	 * de tamaño N que contenga M en todas sus posiciones. Luego muestra el array
	 * por pantalla.
	 */
	public static void main(String[] args) {

		int valorN, valorM;

		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca el tamaño de la tabla: ");
		valorN = lee.nextInt();
		System.out.println("Por favor introduzca el valor con el que quiere llenar cada posicion: ");
		valorM = lee.nextInt();

		int tabla[] = new int[valorN];

		Arrays.fill(tabla, valorM);

		System.out.println(Arrays.toString(tabla));
		// cerramos el scanner
		lee.close();
	}

}
