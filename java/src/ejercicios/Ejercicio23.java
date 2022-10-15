/**
 * Crear un ArrayList, agregar 5 números enteros.
 * Luego, agregar un número entero al principio de la lista y otro al final.
 * Por último, iterar e imprimir los elementos de la lista y el tamaño de la
 * misma (antes y después de agregar a en la primera y última posición).
 */
package ejercicios;

import java.util.ArrayList;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio23 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Definición de la variables
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        Comunes.titulo("ARRAY DE NÚMEROS ENTEROS", "=");

        numeros.add(5);
        numeros.add(15);
        numeros.add(23);
        numeros.add(8);
        numeros.add(2);

        // Trabajando con un array.
        System.out.println("\n\tAntes de agregar al inicio y al final");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + " - " + numeros.get(i));
        }
        System.out.println("\tTamaño del Array : " + numeros.size());
        
        numeros.add(0, 101);
        numeros.add(94);
        System.out.println("\n\tDespues de agregar al inicio y al final");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + " - " + numeros.get(i));
        }
        System.out.println("\tTamaño del Array : " + numeros.size() + "\n");

        // Final
        Comunes.titulo("FIN.", "-");
    }
}
