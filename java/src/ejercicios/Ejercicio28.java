/**
 * Crear una función que dado 2 argumentos (int, siendo el primero menor al
 * segundo), nos devuelva un array de Strings. Con la secuencia de números
 * enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor "Fizz", si es múltiplo de 3 "Buzz"
 * y si es a la vez múltiplo de ambos colocara "FizzBuzz". 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)
Output (Salida):
["1", "Fizz", "Buzz", "Fizz", "5"]
["1", "Fizz", "Buzz", "Fizz", "5", "FizzBuzz", "7"]

package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio28 {

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
