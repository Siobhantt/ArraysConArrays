package arrays;

import java.util.Arrays;

public class Ej2 {
	/*
	 * Crea un programa que cree un array de enteros e introduzca la siguiente
	 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
	 * introducir 10 diez veces, y luego la muestre por pantalla. En esta ocasión
	 * has de utilizar Arrays.fill().
	 */
	public static void main(String[] args) {

		int tabla[] = new int[55];

		tabla[0] = 1;

		Arrays.fill(tabla, 1, 3, 2);

		Arrays.fill(tabla, 3, 6, 3);

		Arrays.fill(tabla, 6, 10, 4);

		Arrays.fill(tabla, 10, 15, 5);

		Arrays.fill(tabla, 15, 21, 6);

		Arrays.fill(tabla, 21, 28, 7);

		Arrays.fill(tabla, 28, 36, 8);

		Arrays.fill(tabla, 36, 45, 9);

		Arrays.fill(tabla, 45, 55, 10);

		System.out.println(Arrays.toString(tabla));

	}

}
