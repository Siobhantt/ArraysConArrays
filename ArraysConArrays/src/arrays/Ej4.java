package arrays;

import java.util.Arrays;

public class Ej4 {
	/*
	 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
	 * aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores
	 * del array y los mostrará por pantalla.
	 */
	public static void main(String[] args) {

		int tabla[] = new int[30];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}
		System.out.print("Tabla desordenada");
		System.out.println(Arrays.toString(tabla));
		Arrays.sort(tabla);
		System.out.println();
		System.out.print("Tabla ordenada");
		System.out.println(Arrays.toString(tabla));

	}

}
