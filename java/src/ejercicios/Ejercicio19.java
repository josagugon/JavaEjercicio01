/**
 * Realizar un programa que dado un String de entrada en min�sculas
 * lo convierta por completo a may�sculas.
 * Sin uso de m�todos o librer�as que realicen toUppercase().
 * Input (Entrada):
 * 		informatorio
 * Output (Salida):
 * 		INFORMATORIO
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 14 oct. 2022
 */
public class Ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definici�n de la variables
		Scanner teclado = new Scanner(System.in);
		String ingreso, ingresoMayusculas, caracter;
		char caracterMayuscula;
		long terminar;
		int codigo;

		// Ingreso de dato
		do {
			Comunes.titulo("CONVERTIR EN MAY�SCULAS UN STRING", "=");

			terminar = 1;
			do {
				System.out.print("Ingresar texto en min�sculas : ");
				ingreso = teclado.nextLine();
				// Verifica la longitud
				if (null != ingreso && ingreso.length() > 0) {
					terminar = 0;
				}
			} while (terminar != 0);

			terminar = 1;

			// Convierte en may�sculas el texto ingresado.
			ingresoMayusculas = "";
			caracter = "";
			caracterMayuscula = 'A';
			codigo = 0;
			for (int i = 0; i < ingreso.length(); i++) {
				caracter = ingreso.substring(i, i + 1);
				codigo = caracter.codePointAt(0);
				if (codigo >= 97 && codigo <= 122) {
					codigo -= 32;
				}
				caracterMayuscula = (char) codigo;
				ingresoMayusculas += caracterMayuscula;
			}

			Comunes.linea("-", 40);
			System.out.println("\tIngreso : " + ingreso + "\n\tSalida  : " + ingresoMayusculas);
			Comunes.linea("-", 40);

			System.out.print("Si desea terminar presione 0 : ");

			terminar = 1;
			ingreso = teclado.next();
			teclado.nextLine();
			// Verifica si es n�merico
			if (Comunes.esNumero(ingreso)) {
				terminar = Long.parseLong(ingreso);
			}
		} while (terminar != 0);

		// Final
		Comunes.titulo("FIN.", "-");
		teclado.close();
	}
}
