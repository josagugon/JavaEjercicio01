/**
 * Debemos realizar un programa que nos realizar� una pregunta si queremos
 * realizar una operaci�n dada o si deseamos salir/terminar el programa.
 * Utilizaremos en este caso una simple operaci�n que nos pide un n�mero
 * y luego lo imprime.
 * Ahora debes hacerlo tu:
 * Siguiendo este ejemplo, trata de mejorar el c�digo de los ejercicios
 * 7, 8, 9 y 10. Donde realizaremos una vez la operaci�n y luego preguntaremos
 * si continuar con otro c�lculo. Caso contrario, finaliza el programa
 * Otra variante usando la sentencia do-while:
 * En la sentencia while, la condici�n para ejecutar un ciclo del bucle
 * se eval�a al principio. De esta forma, es posible que dicha evaluaci�n
 * sea falsa desde el principio y el bucle itera 0 veces (o no itere).
 * En cambio con la sentencia do-while eval�a la condici�n de fin al final
 * del bucle, quiere decir que el bucle m�nimamente iterara 1 vez.
 * En el siguiente ejemplo se realiza la misma versi�n del c�digo anterior
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
		// Definici�n de la variables
		Scanner teclado = new Scanner(System.in);
		int numero, continuar;

		// Ingreso de dato
		do {
			System.out.print("Por favor Ingresar un n�mero :");
			numero = teclado.nextInt();

			System.out.println("\tEL NUMERO INGRESADO ES: " + numero);

			System.out.print("Si desea continuar presione 1, sino cualquier otro n�mero:");
			continuar = teclado.nextInt();
		} while (continuar == 1);
		System.out.println("FIN");
		teclado.close();

	}

}
