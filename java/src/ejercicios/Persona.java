/**
 * Haz una clase llamada Persona que siga las siguientes condiciones:
 * Sus atributos son:nombre,edad,DNI,sexo (H hombre, M mujer), peso y altura.
 * No queremos que se acceda directamente a ellos.
 * Piensa que modificador de acceso es el más adecuado, también su tipo.
 * Si quieres añadir algún atributo puedes hacerlo.
 * Por defecto, todos los atributos menos el DNI serán valores por defecto
 * según su tipo (0 números, cadena vacía para String, etc.).
 * Sexo sera hombre por defecto, usa una constante para ello.
 * Se implantaran varios constructores:
 * Un constructor por defecto.
 * Un constructor con el nombre, edad y sexo, el resto por defecto.
 * Un constructor con todos los atributos como parámetro.
 * Los métodos que se implementarán son:
 * calcularIMC(): calculará si la persona está en su peso ideal
 * (peso en kg/(altura^2 en m)),si esta fórmula devuelve un valor menor que 20,
 * la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
 * significa que está por debajo de su peso ideal la función devuelve un 0
 * y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
 * la función devuelve un 1.
 * Te recomiendo que uses constantes para devolver estos valores.
 * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto.
 * Si no es correcto, será H.
 * No será visible al exterior.
 * toString(): devuelve toda la información del objeto.
 * generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este
 * su número su letra correspondiente.
 * Este método será invocado cuando se construya el objeto.
 * Puedes dividir el método para que te sea más fácil.
 * No será visible al exterior.
 * Métodos set de cada parámetro, excepto de DNI.
 */

package ejercicios;

/**
 * @author agustin
 */

public class Persona {
    /**
	 * Constantes
	 */
    public final static char SEXO_INICIAL = 'H';

    // imc menor que 20
    public final int BAJO_PESO = -1;
    
    // imc entre 20 y 25 incluidos
    public final int PESO_IDEAL = 0;
    
    // imc mayor que 25
    public final int SOBRE_PESO = 1;

    public static String mensajeImc = "";
    public static String mensajeMayor = "";

    /**
	 * Atributos de la clase Persona
	 */
	private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;
    
    /**
	 * Calculará si la persona está en su peso ideal
	 */
    public int calcularIMC() {
    	double imc = 0;
    	int auxiliar = 0;
    	mensajeImc = "\tSIN DATOS";
    	if (altura > 0) { 
    		imc = peso / (altura * altura);
    	}
    	if (imc > 0 && imc < 20) {
    		auxiliar = BAJO_PESO;	
    		mensajeImc = "\tBAJO PESO";
    	} else if (imc >= 20 && imc <=25){
    		auxiliar = PESO_IDEAL;	
    		mensajeImc = "\tPESO IDEAL";
    	} else if (imc >= 20 && imc <=25){
    		auxiliar = SOBRE_PESO;
    		mensajeImc = "\tSOBRE PESO";
    	}
    	return auxiliar;
    }

    /**
	 * Indica se es mayor de edad, devuelve un booleano
	 */
    public boolean esMayorDeEdad() {
    	boolean esMayor = false;
    	mensajeMayor = "\tES MENOR DE EDAD";
    	if (edad >= 18) {
        	esMayor = true;
        	mensajeMayor = "\tES MAYOR DE EDAD";
        }
        return esMayor;
    }

    /**
	 * Comprueba que el sexo introducido es correcto.
	 * Si no es correcto, será H.
	 * No será visible al exterior.
	 */
    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_INICIAL;
        } else {
            this.sexo = sexo;
        }
    }

    /**
	 * Devuelve toda la información del objeto.
	 */
    public String toString() {
        String genero = "";
        if (this.sexo == 'H') {
        	genero = "Hombre";
        } else {
        	genero = "Mujer";
        }
        return "\tNombre\t\t: " + nombre + "\n\tEdad\t\t: " + edad
        		+ "\taños\n\tDNI\t\t: " + String.format("%,d", dni)
        		+ "\n\tSexo\t\t: " + genero + "\n\tPeso\t\t: " + peso
        		+ "\tkilos\n\tAltura\t\t: " + altura + "\tmetros"
        		+ "\n\tIMC\t\t: " + calcularIMC()+ mensajeImc
        		+ "\n\tMayor de edad\t: " + esMayorDeEdad()+ mensajeMayor;
    }

    /**
	 * Genera un número aleatorio de 8 cifras 
	 */
    private void generarDNI() {
    	int menor = 1000000;
    	int mayor = 99999999;

    	int documento = ((int) Math.floor(Math.random() * (mayor - menor + 1) + menor));

        this.dni = documento;
    }

    /**
	 * Constructor por defecto 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
		super();
		this.nombre = "";
		this.edad = 0;
		generarDNI();
		this.sexo = SEXO_INICIAL;
		this.peso = 0.0;
		this.altura = 0.0;
	}   

	/**
	 * Constructor con el nombre, edad y sexo, el rsto por defecto 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		generarDNI();
		comprobarSexo(sexo);
		this.peso = 0.0;
		this.altura = 0.0;
	}

	/**
	 * Constructor con todos los atributos como parámetro, menos DNI
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		generarDNI();
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the dNI
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		comprobarSexo(sexo);
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
