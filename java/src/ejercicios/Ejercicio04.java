/**
 * Dado un archivo de texto (alumnos.txt), crear una función que lea todos
 * los nombres de los alumnos y los imprima por pantalla.
 * Observación:
 * Cada línea del archivo representa un nombre de alumno.
 */
package ejercicios;

import java.io.*;

/**
 * @author agustin
 * @version 2022.10.11
 */
public class Ejercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File archivo = null;
		FileReader archivoLector = null;
		BufferedReader archivoDatos = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("E:\\git\\JavaEjercicio01\\java\\resources\\files\\alumnos.txt");
			archivoLector = new FileReader(archivo);
			archivoDatos = new BufferedReader(archivoLector);

			// Lectura del fichero
			String linea;
			while ((linea = archivoDatos.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != archivoLector) {
					archivoLector.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
