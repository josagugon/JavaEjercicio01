/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author agustin
 * @version 2022.10.10
 *
 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pide por teclado el nombre, la edad, sexo, peso y altura
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.next();
        
        System.out.print("Ingresa tu edad en años: ");
        int edad = teclado.nextInt();
        
        System.out.print("Ingresa tu género, H = Hombre o M = Mujer: ");
        char sexo = teclado.next().charAt(0);
        
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = teclado.nextDouble();
        
        System.out.print("Ingresa tu altura en metros: ");
        double altura = teclado.nextDouble();

        /*
         * Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
         * anteriores variables pedidas por teclado, el segundo objeto obtendrá
         * todos los anteriores menos el peso y la altura y el último por
         * defecto, para este último utiliza los métodos set para darle a los
         * atributos un valor.
         * Para cada objeto, deberá comprobar si está en su peso ideal, tiene
         * sobrepeso o por debajo de su peso ideal con un mensaje.
         * Indicar para cada objeto si es mayor de edad.
         * Por último, mostrar la información de cada objeto.
         * Puedes usar métodos en la clase ejecutable, para que sea más fácil.
         */
        
        System.out.println("\nConstructor con todos los atributos:");
		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		System.out.println(persona1.toString());

		System.out.println("\nConstructor con nombre, edad y sexo:");
		Persona persona2 = new Persona();
		persona2.setNombre(nombre);
		persona2.setEdad(edad);
		persona2.setSexo(sexo);
		System.out.println(persona2.toString());

		System.out.println("\nConstructor por defecto:");
		Persona persona3 = new Persona();
		System.out.println(persona3.toString());
	}
}
