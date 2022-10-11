/**
 * Teniendo una lista de objetos Empleado,
 * cargar la misma en un archivo empleado.txt.
 * Observación:
 * Cada empleado se almacena en una sola línea con el formato que se defina.
 */
package ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author agustin
 * @version 2022.10.11
 */
public class Ejercicio05 {

	/**
	 * Constantes
	 */
	public final static String ARCHIVO05 = "E:\\git\\JavaEjercicio01\\java\\resources\\files\\empleado.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Empleado> listaEmpleados = new ArrayList<>();

		listaEmpleados.add(new Empleado(12_345_657, "Jose", "González"));
		listaEmpleados.add(new Empleado(12_345_658, "Carlos", "Gómez"));
		listaEmpleados.add(new Empleado(12_345_659, "Maria", "Perez"));
		listaEmpleados.add(new Empleado(12_345_660, "Liliana", "Nuñez"));
		listaEmpleados.add(new Empleado(12_345_661, "Mario", "Cardozo"));
		listaEmpleados.add(new Empleado(12_345_662, "Julia", "Rodriguez"));

		FileWriter archivo = null;
		PrintWriter archivoGuardar = null;
		try {
			archivo = new FileWriter(ARCHIVO05);
			archivoGuardar = new PrintWriter(archivo);
			// Usando un for each
			for (Empleado emp : listaEmpleados) {
				archivoGuardar.println(emp.toString());
				System.out.println(emp.toString());
			}
			;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el archivo.
				if (null != archivo)
					archivo.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
