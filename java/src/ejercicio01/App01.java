/**
 * 
 */
package ejercicio01;

/**
 * @author agustin
 * @version 2022.10.10
 *
 */
public class App01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Constructor por defecto:");
		Persona persona1 = new Persona();
		System.out.println(persona1.toString());
		
		System.out.println("Constructor por con nombre, edad y sexo:");
		Persona persona2 = new Persona("José", 50, 'H');
		System.out.println(persona2.toString());

		System.out.println("Constructor con todos los atributos:");
		Persona persona3 = new Persona("María", 33, 'M', 50, 1.50);
		System.out.println(persona3.toString());
	}

}
