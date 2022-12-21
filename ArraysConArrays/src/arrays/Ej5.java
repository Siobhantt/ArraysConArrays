package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ej5 {
	/*
	 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
	 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
	 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
	 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
	 * más alta a la más baja).
	 */
	public static void main(String[] args) {
		int ranking[] = new int[8];

		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca las puntuaciones: ");
		for (int i = 0; i < 8; i++) {// Guardamos los valores en la tabla
			ranking[i] = lee.nextInt();
		}

		for (int i = 0; i < ranking.length - 1; i++) {
			int max = i;

			// buscamos el mayor número
			for (int j = i + 1; j < ranking.length; j++) {
				if (ranking[j] > ranking[max]) {

					max = j; // encontramos el mayor número
				}
			}

			if (i != max) {
				// permutamos los valores
				int aux = ranking[i];
				ranking[i] = ranking[max];
				ranking[max] = aux;
			}
		}
		System.out.println(Arrays.toString(ranking));
	}
}
