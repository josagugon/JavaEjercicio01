/**
 * Se dispone de una colección de Empleados, de cada empleado se conoce:
 *      Nombre y Apellido
 *      DNI
 *      horasTrabajadas
 *      valorPorHora
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular
 * el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
 * almacenar en un Map (o Diccionario) donde la clave (key) es el dni y
 * el valor (value) es el sueldo calculado.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio27 {

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
