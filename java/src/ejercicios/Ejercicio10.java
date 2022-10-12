/**
 * Desarrollar un programa que dado un número entero ingresado,
 * nos retorne los valores de ese número multiplicado por 1, 2, 3,... y 10.
 * Ejemplo para el dato de entrada: 2
 * Salida:
 * 		2 * 1 = 2
 * 		2 * 2 = 4
 * 		2 * 3 = 6
 * 		2 * 4 = 8
 * 		2 * 5 = 10
 * 		2 * 6 = 12
 * 		2 * 7 = 14
 * 		2 * 8 = 16
 * 		2 * 9 = 18
 * 		2 * 10 = 20
 * Solución (for):
 * Aplicaremos una de las estructuras condicionales que usamos también en el
 * módulo de Python que es el bucle for (o también llamado Para).
 * La sintaxis de for para uso general es de la siguiente manera:
 * for (inicialización; terminación; incremento)
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		int numero;

		// Ingreso de dato
		do {
			System.out.print("Ingresar un número del 1 al 999 :");
			numero = teclado.nextInt();
		} while (numero < 1 || numero > 999);
		teclado.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println("\t" + numero + " *" + i + "\t= " + numero * i);
		}
	}
}
