/**
 * Cargar un arrayList con 12 nombres de estudiantes (String),
 * luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 * Ayuda: ArrayList posee un método para particionar en sub-listas?
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio25 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Definición de la variables
        ArrayList<String> estudiantes = new ArrayList<String>();

        Comunes.titulo("ARRAY : LISTAS DE ESTUDIANTES", "=");

        estudiantes.add("Carlos");
        estudiantes.add("Juan");
        estudiantes.add("Maria");
        estudiantes.add("Marcos");
        estudiantes.add("Liliana");
        estudiantes.add("Ramiro");
        estudiantes.add("Matias");
        estudiantes.add("Julia");
        estudiantes.add("Juana");
        estudiantes.add("Victoria");
        estudiantes.add("Pedro");
        estudiantes.add("Beatriz");

        // Trabajando con la lista.
        Comunes.titulo("Lista de estudiantes.", "-");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + estudiantes.get(i));
        }

        // Separar en tres cursos.
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);

        Comunes.titulo("Lista de estudiantes del CURSO 1.", "-");
        for (int i = 0; i < curso1.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + curso1.get(i));
        }

        Comunes.titulo("Lista de estudiantes del CURSO 2.", "-");
        for (int i = 0; i < curso2.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + curso2.get(i));
        }

        Comunes.titulo("Lista de estudiantes del CURSO 3.", "-");
        for (int i = 0; i < curso3.size(); i++) {
            System.out.println("\t\t#" + (i + 1) + "\t- " + curso3.get(i));
        }

        // Final
        Comunes.titulo("FIN.", "-");
    }
}
