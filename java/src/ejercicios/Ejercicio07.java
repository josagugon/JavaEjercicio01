/**
 * Realizar un programa que al ejecutar se pueda ingresar 3 números enteros,
 * para luego imprimirlos por pantalla de la siguiente manera:
 * 	El primer nro ingresado es	: 4
 * 	El segundo nro ingresado es	: 5
 * 	El tercer nro ingresado es	: 6
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 2022.10.11
 */
public class Ejercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de las variables
		int[] numeros = new int[3];
		Scanner teclado = new Scanner(System.in);
		
		// Lee tres datos del teclado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingresar el N°" + (i + 1) + " : ");
			numeros[i] = teclado.nextInt();
		}
		
		// Muestra el resultado
		System.out.println("\tEl primer nro ingresado es\t: " + numeros[0]);
		System.out.println("\tEl segundo nro ingresado es\t: " + numeros[1]);
		System.out.println("\tEl tercer nro ingresado es\t: " + numeros[2]);
		teclado.close();
	}

}
