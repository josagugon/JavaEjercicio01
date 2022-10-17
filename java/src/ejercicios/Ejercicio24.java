/**
 * Crear una lista que contenga como elementos la numeración de cartas de una
 * baraja francesa (solo los valores, no figuras).
 * Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden
 * inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 * Ayuda: ArrayList implementa la interface Collection, existe algún método
 * que me permita hacer la operación sort (mezclar) aleatoriamente?
 * Idem para el reverso.
 * A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio24 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Definición de la variables
        ArrayList<String> cartas = new ArrayList<String>();
        String auxiliar = "";

        Comunes.titulo("ARRAY : CARTAS BARAJA FRANCESA", "=");

        cartas.add("A");
        for (int i = 2; i <= 10; i++) {
            cartas.add(String.valueOf(i));
        }
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");

        // Trabajando con las cartas.
        Comunes.titulo("Cartas ordenadas.", "-");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + cartas.get(i));
        }

        Collections.reverse(cartas);
        Comunes.titulo("Cartas ordenadas inversamente.", "-");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + cartas.get(i));
        }

        Collections.shuffle(cartas);
        Comunes.titulo("Cartas desordenadas.", "-");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + cartas.get(i));
        }

        Collections.sort(cartas);
        auxiliar=cartas.get(0);
        cartas.set(0, cartas.get(9));
        cartas.set(9, auxiliar);
        Comunes.titulo("Cartas ordenadas nuevamente.", "-");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + cartas.get(i));
        }

        // Final
        Comunes.titulo("FIN.", "-");
    }
}
