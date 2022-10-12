/**
 * Tendremos un sistema que debe clasificar el resultado de una evaluación.
 * Como dato de entrada tendremos un entero y como resultado un String de la
 * clasificación de la siguiente forma:
 * Rango	Clasificación
 * 93 - 100	Excelente
 * 85 - 92	Sobresaliente
 * 75 - 84	Distinguido
 * 60 - 74	Bueno
 * 00 - 59	Desaprobado
 */
package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author agustin
 * @version 2022.10.12
 */
public class Ejercicio08 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Definición de las variables.
		long evaluacion, desdeL, hastaL;
		Map<Long, String> sistema = new HashMap<>();
		Scanner teclado = new Scanner(System.in);
		String clasificacion, valor, desde, hasta;

		sistema.put(59L, "Desaprobado");
		sistema.put(60074L, "Bueno");
		sistema.put(75084L, "Distinguido");
		sistema.put(85092L, "Sobresaliente");
		sistema.put(93100L, "Excelente");
		
		do {
			System.out.print("Ingresar el resultado de la evaluación :");
			evaluacion = teclado.nextLong();
		} while (evaluacion < 0 || evaluacion > 100);
		teclado.close();
		
		clasificacion = "";
		
	    for (Long key : sistema.keySet()) {
	    	valor = String.valueOf(key);
	    	if (valor.length()<5) {
	    		valor = "000" + valor;
	    	}
	    	desde = valor.substring(0, 2);
	    	hasta = valor.substring(2, 5);
	    	desdeL = Long.parseLong(desde);
	    	hastaL = Long.parseLong(hasta);
	        // System.out.println(key + ":" + sistema.get(key) + ":" + desdeL + ":" + hastaL);
	        if (evaluacion >= desdeL && evaluacion <= hastaL) {
	        	clasificacion = sistema.get(key);
	        }
	    }
        System.out.println("Para la evaluación de: " + evaluacion + " corresponde :" + clasificacion);
	}

}
