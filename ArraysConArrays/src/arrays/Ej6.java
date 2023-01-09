package arrays;

import java.util.Scanner;

public class Ej6 {
	/*
	 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
	 * enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por
	 * teclado un valor N y se mostrará por pantalla si N existe en el array, además
	 * de cuantas veces. Usa una búsqueda secuencial (no se hace uso de la clase
	 * Arrays).
	 */
	public static void main(String[] args) {

		int aleatorio[] = new int[1000];
		int valorUser;
		int indiceBusqueda = 0;

		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < aleatorio.length; i++) {

			aleatorio[i] = (int) Math.random() * 100;
		}
		System.out.println("Por favor introduzca un valor: ");
		valorUser = lee.nextInt();

		while (valorUser != aleatorio[indiceBusqueda] && indiceBusqueda < aleatorio.length) {
			indiceBusqueda++;
		}
		if (indiceBusqueda < aleatorio.length) {
			System.out.println("El valor  " + valorUser + " se encuentra en la posicion " + indiceBusqueda);
		} else {
			System.out.println("El elemento " + valorUser + " no se encuentra en la tabla.");

		}
	}

}
