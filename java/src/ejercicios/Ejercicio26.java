/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y
 * valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
 * Se debe generar otra lista que contenga los totales y luego imprimir
 * el total final a cobrar.
 * Input (Entrada):
 *      [6, 7, 8, 4, 5]
 *      [350, 345, 550, 600, 320]
 * Los arrays son iguales y corresponden a los días trabajados de una semana
 * Lun-Vie.
 * Output (Salida):
 *      [2100, 2415, 4400, 2400, 1600]
 *      Total Final: $ 12915
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio26 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Definición de la variables
        ArrayList<Integer> horas = new ArrayList<Integer>();
        ArrayList<Integer> valor = new ArrayList<Integer>();
        ArrayList<Integer> totales = new ArrayList<Integer>();
        long cobrar = 0;

        Comunes.titulo("ARRAY : SUELDO SEMANAL", "=");

        horas.add(6);
        horas.add(7);
        horas.add(8);
        horas.add(4);
        horas.add(5);

        valor.add(350);
        valor.add(345);
        valor.add(550);
        valor.add(600);
        valor.add(320);

        // Trabajando con la lista.
        Comunes.titulo("Totales diarios.", "-");
        for (int i = 0; i < horas.size(); i++) {
            totales.add(horas.get(i) * valor.get(i));
            cobrar += horas.get(i) * valor.get(i);
            System.out.println("\t\t#" + (i + 1) + "\t$" + totales.get(i));
        }
        System.out.println("\tTotal Final:\t$" + cobrar);

        // Final
        Comunes.titulo("FIN.", "-");
    }
}
