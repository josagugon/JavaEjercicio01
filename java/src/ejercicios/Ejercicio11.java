/**
 * Debemos realizar un programa que nos realizará una pregunta si queremos
 * realizar una operación dada o si deseamos salir/terminar el programa.
 * Utilizaremos en este caso una simple operación que nos pide un número
 * y luego lo imprime.
 * Ahora debes hacerlo tu:
 * Siguiendo este ejemplo, trata de mejorar el código de los ejercicios
 * 7, 8, 9 y 10. Donde realizaremos una vez la operación y luego preguntaremos
 * si continuar con otro cálculo. Caso contrario, finaliza el programa
 * Otra variante usando la sentencia do-while:
 * En la sentencia while, la condición para ejecutar un ciclo del bucle
 * se evalúa al principio. De esta forma, es posible que dicha evaluación
 * sea falsa desde el principio y el bucle itera 0 veces (o no itere).
 * En cambio con la sentencia do-while evalúa la condición de fin al final
 * del bucle, quiere decir que el bucle mínimamente iterara 1 vez.
 * En el siguiente ejemplo se realiza la misma versión del código anterior
 * pero con el bucle do-while.
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 12 oct. 2022
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definición de la variables
		Scanner teclado = new Scanner(System.in);
		int numero, continuar;

		// Ingreso de dato
		do {
			System.out.print("Por favor Ingresar un número :");
			numero = teclado.nextInt();

			System.out.println("\tEL NUMERO INGRESADO ES: " + numero);

			System.out.print("Si desea continuar presione 1, sino cualquier otro número:");
			continuar = teclado.nextInt();
		} while (continuar == 1);
		System.out.println("FIN");
		teclado.close();

	}

}
