/**
 * 
 */
package ejercicio01;

/**
 * @author agustin
 *
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
    	double imc = peso / (altura * altura);
    	int auxiliar = 0;
    	if (imc < 20) {
    		auxiliar = BAJO_PESO;	
    	} else if (imc >= 20 && imc <=25){
    		auxiliar = PESO_IDEAL;	
    	} else if (imc >= 20 && imc <=25){
    		auxiliar = SOBRE_PESO;
    	}
    	return auxiliar;
    }

    /**
	 * Indica se es mayor de edad, devuelve un booleano
	 */
    public boolean esMayorDeEdad(boolean esMayor) {
    	esMayor = false;
        if (edad >= 18) {
        	esMayor = true;
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
        //return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + dni
        //		+ "\nSexo: " + genero + "\nPeso: " + peso + "\nAltura: " + altura;
        
        return "\tNombre\t: " + nombre + "\n\tEdad\t: " + edad
        		+ " años\n\tDNI\t: " + String.format("%,d", dni) + "\n\tSexo\t: " + genero
        		+ "\n\tPeso\t: " + peso + " kilos\n\tAltura\t: " + altura + " metros";
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
