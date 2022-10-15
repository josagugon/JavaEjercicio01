/**
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad
 * de veces que aparece una letra dada.
 * Input (Entrada):
 *      Hola Informatorio Java 2022.
 *      A
 * Output (Salida):
 *      4
 */
package ejercicios;

/**
 * @author agustin
 * @version 15 oct. 2022
 */
public class Ejercicio21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Definici n de la variables
        String texto, letra;
        int cantidad, posicion;
        long terminar;

        // Ingreso de dato
        do {
            Comunes.titulo("CUANTO SE REPITE UNA LETRA", "=");

            terminar = 1;
            texto = "";
            do {
                System.out.print("Ingresar el texto para analizar\t: ");
                texto = Comunes.teclado.nextLine();
                texto = texto.toUpperCase();
                // Verifica la longitud
                if (null != texto && texto.length() > 0) {
                    terminar = 0;
                }
            } while (terminar != 0);

            terminar = 1;
            letra = "";
            do {
                System.out.print("Ingresar una letra para contar\t: ");
                letra = Comunes.teclado.nextLine();
                letra = letra.toUpperCase();
                // Verifica la longitud
                if (null != letra && letra.length() == 1) {
                    terminar = 0;
                }
            } while (terminar != 0);

            // Calcular cuanto se repite la letra.
            cantidad = 0;
            posicion = texto.indexOf(letra);
            while (posicion != -1) {
                cantidad++;
                posicion = texto.indexOf(letra, posicion + 1);
            }

            // Resultado
            Comunes.linea("-", 50);
            System.out.println("\tLa letra: " + letra + " en: " + texto + ", aparece: " + cantidad);
            Comunes.linea("-", 50);

            terminar = Comunes.continua();
        } while (terminar != 0);

        // Final
        Comunes.titulo("FIN.", "-");
        Comunes.teclado.close();
    }
}