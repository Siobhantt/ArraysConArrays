package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
/*Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en otro array.
 *  Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.*/
	public static void main(String[] args) {
		
		int tabla[]= new int[10];
		int tabla2[] = new int[10];
		int numUser;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 20 numeros separados por enter: ");
		
		for(int i =0; i<10; i++) {
			numUser = lee.nextInt();
			tabla[i]= numUser;
		}
		for(int i=0; i<10;i++) {
			numUser = lee.nextInt();
			tabla2[i]=numUser;
		}
	System.out.println(Arrays.toString(tabla));
	System.out.println(Arrays.toString(tabla2));
	System.out.println("Las tablas son iguales: " + Arrays.equals(tabla, tabla2));
	
	//cerramos el scanner
	lee.close();
	}

}
