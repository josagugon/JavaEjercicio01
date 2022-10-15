# Ejercicios Informatorio JAVA 2022
EJERCICIO PROPUESTO POR EL PROFESOR:

#Ejercicio 1:
Haz una clase llamada Persona que siga las siguientes condiciones:
•	Sus atributos son:
o	nombre,
o	edad,
o	DNI,
o	sexo (H hombre, M mujer),
o	peso y altura.
•	No queremos que se acceda directamente a ellos.
•	Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
•	Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 para números, cadena vacía para String, etc.).
•	Sexo será hombre por defecto, usa una constante para ello.
•	Se implantaran varios constructores:
o	Un constructor por defecto.
o	Un constructor con el nombre, edad y sexo, el resto por defecto.
o	Un constructor con todos los atributos como parámetro.
•	Los métodos que se implementarán son:
o	calcularIMC(): calculará si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
o	esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
o	comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. No será visible al exterior.
o	toString(): devuelve toda la información del objeto.
o	generaDNI(): genera un número aleatorio de 8 cifras. Este método será invocado cuando se construya el objeto. No será visible al exterior.
•	Métodos set de cada parámetro, excepto de DNI.
•	Ahora, crea una clase ejecutable que haga lo siguiente:
o	Pide por teclado el nombre, la edad, sexo, peso y altura.
o	Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
o	Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
o	Indicar para cada objeto si es mayor de edad.
o	Por último, mostrar la información de cada objeto.
•	Puedes usar métodos en la clase ejecutable, para que sea más fácil.
 
EJERCICIOS PROPUESTOS EN EL CAMPUS:

##Ejercicio 2:
Crear una función que realice la suma de 2 números dados.
Observaciones:
Se deberán aplicar estilo de código (Java) y uso de funciones.

##Ejercicio 3:
Realizar una función que calcule el factorial de un número dado.
Observaciones:
Se deberán aplicar estilo de código (Java) y uso de funciones.
Se deberá aplicar el concepto de Recursividad.

##Ejercicio 4:
Dado un archivo de texto (alumnos.txt), crear una función que lea todos los nombres de los alumnos y los imprima por pantalla.
Observación:
Cada línea del archivo representa un nombre de alumno.

#Ejercicio 5:
Teniendo una lista de objetos Empleado, cargar la misma en un archivo empleado.txt.
Observación:
Cada empleado se almacena en una sola línea con el formato que se defina.

#Ejercicio 6:
Realizar un programa que realice la impresión por consola del siguiente mensaje:
¡¡¡ Hola Informatorio 2022 !!!

#Ejercicio 7:
Realizar un programa que al ejecutar se pueda ingresar 3 números enteros, para luego imprimirlos por pantalla de la siguiente manera:
El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6

#Ejercicio 8:
Tendremos un sistema que debe clasificar el resultado de una evaluación. Como dato de entrada tendremos un entero y como resultado un String de la clasificación de la siguiente forma:
Rango	Clasificación
93 - 100	Excelente
85 - 92	Sobresaliente
75 - 84	Distinguido
60 - 74	Bueno
00 - 59	Desaprobado
Solución (if-else):
Podemos ver el uso de la sintaxis condicional if-else, tal como lo vimos en Python. Pueden existir otras soluciones aceptables y que resuelvan el problema también (por ejemplo, en vez de preguntar por mayor podemos hacerlo por menor).También vemos el uso de operadores lógicos. Debajo se adjunta otros operadores de comparación y lógicos comunes para que puedas usarlos en otros ejercicios propuestos.
Operador	Significado
==	Igualdad
!=	Distinto (No igual)
>	Mayor
>=	Mayor o Igual
<	Menor
<=	Menor o Igual

#Ejercicio 9:
Realizar un programa que dado un número de entrada entre 1 a 7, nos devuelva el dia de la semana de la siguiente forma:
Número	Dia
1	Domingo
2	Lunes
3	Martes
4	Miercoles
5	Jueves
6	Viernes
7	Sabado 
Solución 1 (if-else):
Podemos desarrollar un programa parecido al ejercicio anterior número 8. Intentalo!!
Solución 2 (switch):
En este caso, podremos observar la sentencia switch (también llamada según). La funcionalidad que expone esta sentencia se basa según un caso, realiza una operación.
Prestemos atención a la sentencia break. 
¿Qué sucedería si eliminamos todas esas sentencias break? 
¿Que imprimirá si luego ejecuto el programa e ingreso el número 4?.

#Ejercicio 10:
Desarrollar un programa que dado un número entero ingresado, nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.
Ejemplo para el dato de entrada: 2
Salida:
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20
Solución (for):
Aplicaremos una de las estructuras condicionales que usamos también en el módulo de Python que es el bucle for (o también llamado Para).
La sintaxis de for para uso general es de la siguiente manera:
for (inicialización; terminación; incremento)


#Ejercicio 11:
Debemos realizar un programa que nos realizará una pregunta si queremos realizar una operación dada o si deseamos salir/terminar el programa.
Utilizaremos en este caso una simple operación que nos pide un número y luego lo imprime.

Ahora debes hacerlo tu:
Siguiendo este ejemplo, trata de mejorar el código de los ejercicios 2, 3, 4 y 5. Donde realizaremos una vez la operación y luego preguntaremos si continuar con otro cálculo. Caso contrario, finaliza el programa

Otra variante usando la sentencia do-while:
En la sentencia while, la condición para ejecutar un ciclo del bucle se evalúa al principio. De esta forma, es posible que dicha evaluación sea falsa desde el principio y el bucle itera 0 veces (o no itere).
En cambio con la sentencia do-while evalúa la condición de fin al final del bucle, quiere decir que el bucle mínimamente iterara 1 vez. En el siguiente ejemplo se realiza la misma versión del código anterior pero con el bucle do-while.

#Ejercicio 12:
En base a los ejercicios 7 al 9, modificar los programas para que separe la lógica de negocio (cálculo aritmético, procesamiento, etc) en funciones.

EJERCICIOS - LEVEL 1
TIPS:
Los programas en JAVA consisten en clases. Un pequeño programa puede ser contenido en una sola clase. Por cada clase se debe crear un archivo que debe coincidir con el nombre de la clase.

Ejemplo: Creando la el archivo Home.java
 

#Ejercicio 13:
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
Input (Entrada):
Obi Wan Kenobi
Output (Salida):
HOLA Obi Wan Kenobi!!!
Ejercicio 14:
Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
Input (Entrada):
5
4
Output (Salida):
5 + 4 = 9
5 - 4 = 1
5 * 4 = 20
5 / 4 = 1
5 % 4 = 1

#Ejercicio 15:
Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
Input (Entrada):
5
Output (Salida):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

#Ejercicio 16:
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.

Input (Entrada):
5
Output (Salida):
El factorial de 5 es: 120

#Ejercicio 17:
Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).

Input (Entrada):
2
3

Output (Salida):
2 x 3 = 6
#Ejercicio 18:
Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).

Input (Entrada):
3
3

Output (Salida):
3 elevado a 3 = 27

#Ejercicio 19:
Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

 Input (Entrada):
informatorio

Output (Salida):
INFORMATORIO

##Ejercicio 20:
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

Input (Entrada):
Homero Simpson
48
Calle Falsa 1234
Springfield
Output (Salida):
Springfield – Calle Falsa 1234 - 48 - Homero Simpson

##Ejercicio 21:
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
Input (Entrada):
Hola Informatorio Java 2022.
A

Output (Salida):
4
 
EJERCICIOS - LEVEL 2

#Ejercicio 22:
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
Input (Entrada):
Bariloche
Córdoba
Resistencia
Output (Salida):
1 - Bariloche
2 - Córdoba
3 - Resistencia

#Ejercicio 23:
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).

#Ejercicio 24:
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso

#Ejercicio 25:
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?

#Ejercicio 26:
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915

#Ejercicio 27:
Se dispone de una colección de Empleados, de cada empleado se conoce:
○	Nombre y Apellido
○	DNI
○	horasTrabajadas
○	valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 

#Ejercicio 28:
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)
Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]


Práctica Guiada (Streams)

OBJETIVO
El objetivo de este apunte es dar una guía para la resolución de problemas con Streams.
OPTIONAL:
En Java, null es usado para representar “nada” o un resultado “vacío”. Frecuentemente, un método retorna null si este no posee un resultado a retornar. Esto ha sido fuente de frecuentes NullPointerException en programas de Java. 

Supongamos que tenemos una clase Persona, que posee atributos id, nombre, fecha de nacimiento y sueldo. Y deseamos obtener solo el año de nacimiento.

Person homero = new Persona(1, "Homero Simpson", null, 5000.0);
int year = homero.getFechaNacimiento().getYear();
System.out.println(homero.getNombre() + " nació en el año " + year);
El código se compila, pero lanzará NullPointerException en tiempo de ejecución. El problema es en el valor de retorno del método getFechaNacimiento() que retorna null. Java 8 introduce una clase Optional<T> para lidiar con estos NullPointerExceptions. Podemos decir ahora que los métodos que no retornan nada deberían retornar un Optional en lugar de null.

Un Optional es un wrapper (contenedor o envoltura) para valores no nulos que puede contener o no un valor no nulo. 
Algunos métodos que nos provee esta clase:
●	isPresent(): Retorna true si contiene un valor no nulo, caso contrario falso.
●	get(): Nos devuelve el valor no nulo si contiene un valor no nulo, caso contrario lanzará NoSuchElementException.
●	empty(): Método de clase. Que nos retorna un Optional con un valor no nulo.
●	of(T value): Método de clase. Retorna un Optional que contiene un valor especificado como valor no nulo. Si le pasamos nulo, lanzará NullPointerException..
●	ofNullable(T value): Retorna un Optional que contiene un valor especificado como valor no nulo. Si le pasamos nulo, retornara un Optional.empty().

STREAMS
Una operación de agregación procesa un valor individual de una colección de valores. El resultado de una operación de agregación puede ser un valor primitivo, un objeto, o void. Nótese que un objeto puede ser la representación de una entidad simple como una persona o una colección de valores como un List, Set, o Map, etc.

Un stream es una secuencia de elementos de datos que soportan operaciones de agregación de forma secuencial y paralela. Ejemplos de operaciones de agregación son: Procesar la suma de todos los números enteros en un stream de integers, obtener el empleado más antiguo (por la fecha de contratación) en un stream de objetos empleados, etc.

Si vemos la definición de streams, nos parecerá que son como colecciones. Pero en qué difieren una de otra? Ambas son abstracciones para una colección de elementos de datos. Las Collections se enfocan en el almacenamiento de los elementos de datos para un acceso eficiente mientras que los Streams se enfocan en el procesamiento de las operaciones de agregación de una fuente de datos que típicamente es una colección, pero no necesariamente. 

EJERCICIOS (Streams):

#Ejercicio 29:
Crear un Stream vacío:

Solución:

Observación: Ver lo que imprime la consola. ¿Qué nos devuelve?



#Ejercicio 30:
Crear un Stream a partir de una colección. Crear una lista con todas las vocales y pasarla a stream:
Solución:

#Ejercicio 31:
Cargar un stream que contenga N números. Y que comience con el número 40:

En este caso N = 20 (argumento del método limit).
El número 40 es la semilla, que dará el valor inicial, y el segundo argumento de iterate es la función incremento.
Para este caso, el segundo número será 42.

Prestar atención a la operación de agregación limit, a la cual le pasaremos el valor de cuantas veces deberá iterar.
	
EJERCICIOS (Colecciones a Streams):

#Ejercicio 32:
Supongamos que tenemos una lista con objetos de tipo Producto, que poseen atributos nombre, tipo, precio unitario (String, String, BigDecimal), encontrar y devolver el primer producto que su precio unitario sea menor a 200000.00. Caso contrario mostrar mensaje de No encontrado (ver formato del mensaje en la imagen debajo).

Analicemos el código:
●	Creamos una lista de Producto
●	Al objeto catalogoProductos lo pasamos a stream con el método stream() 
●	Con la operación de agregación filter, evaluaremos si la condición que 200000.00 sea mayor que el precioUnitario de cada producto.
●	Como usamos un objeto BigDecimal para definir el precio, no podré usar operadores de <, =, > (que son para primitivos). Usaremos el método compareTo. De forma que:
objeto1.compareTo(objeto2) -> retorna -1, 0, 1 si objeto1 es menor, igual, o mayor a objeto2. Ese resultado si es primitivo.
●	Luego findFirst() captura el primer objeto que cumpla la condición del filter anterior y su valor es encerrado en un objeto Optional. Si ningún objeto cumpliera la condición del filter se retornará un Optional.empty() (que dentro encierra un valor null).
●	Para imprimir el mensaje encontrado o no, preguntaremos si productoBarato.isPresent() (que devolverá true si encierra un valor distinto a null, caso contrario false).
●	Para obtener el valor encerrado de un objeto Optional, invocamos el método get().

#Ejercicio 33:
Supongamos que del ejercicio anterior queremos lanzar una excepción si no llegáramos a encontrar el primer producto que su precio unitario sea menor a 200000,00.
Usaremos una excepción no chequeada (RuntimeException) para simplificar el ejercicio. Pero en escenarios reales se prefiere excepciones chequeadas.
Analicemos el código:
●	En el ejercicio anterior si ningún producto cumplía la condición del filter, la operación devolverá Optional.empty(). Para estos escenarios se puede encadenar el método orElseThrow() para lanzar una excepción. 
●	De esa forma podemos decir que si encontramos un objeto producto que cumpla la condición lo asignaremos a la variable productoBarato, caso contrario lanzaremos exception.

#Ejercicio 34:
Sigamos con el mismo ejemplo. Pero ahora en base a la lista de productos, queremos obtener otra lista que contendrá sólo los productos con precio menor a 200000.00.

Analicemos el código:
●	En este caso todos los productos que cumplan la condición del filter, serán agregados en una nueva colección que en este caso es una lista (Collectors es una clase utilitaria, y el método toList() es el método que creará una lista nueva y agrega consecutivamente los productos que reciba).

#Ejercicio 35:
Ahora necesitamos solamente el nombre de los productos con precio menor a 200000.00. Para ellos queremos extraer de un List<Product> a un List<String>.

Analicemos el código:
●	En este caso usaremos la operación de agregación .map(). Que tiene como objetivo mapear un objeto producto a uno String, por medio del método getNombre() de la clase Producto.

#Ejercicio 36:
Teniendo una lista de Productos queremos imprimir todos los precios unitarios.

Analicemos el código:
●	Aquí utilizaremos .forEach() para realizar una operación con cada producto. En este caso imprimir por consola.
●	Como no estamos convirtiendo, extrayendo elementos o buscando un elemento específico. No necesitaremos una variable para asignar.

#Ejercicio 37:
Deseamos ahora actualizar el precio unitario de cada producto de la lista en +15%.

Output:
{ nombre='iPhone 13 Pro', tipo='Celulares', precioUnitario='460000.0000'}
{ nombre='Samsung Galaxy S21 Ultra', tipo='Celulares', precioUnitario='230000.0000'}
{ nombre='Motorola Edge Special Edition', tipo='Celulares', precioUnitario='183883.8500'}

 
EJERCICIOS - LEVEL 3
Criterios de Calificación:
●	Se deberá subir el link del repo de actividades anteriores. Solo se agregara una carpeta con el nombre "EjerciciosComplementariosLevel3".
●	Los Ejercicios deben tener nombre según la numeración de las consignas. Ejemplo: Ejercicio1.java, Ejercicio2.java, etc.
●	Convenciones de nombre para variables (camelCase), Clases (UpperCamelCase), funciones (camelCase).
●	Prolijidad y fácil lectura. No deberán existir saltos de líneas consecutivos.
●	Entregas fuera de término disminuyen la calificación, como así también devoluciones para rehacer si algún ejercicio no cumple las consignas.
●	Los ejercicios deben ser resueltos con Optional y/o Streams.

#Ejercicio 38:
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío ("").

Input (Entrada):
List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

Output (Salida):
["Hola", "Informatorio"]


#Ejercicio 39:
Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2.

Input (Entrada):
List<Integer> numeros = List.of(1, 2, 3, 4, 5);

Output (Salida):
[1, 4, 9, 16, 25]

 
#Ejercicio 40:
Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).

Input (Entrada):
List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);

Output (Salida):
3

#Ejercicio 41:
Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.

Input (Entrada)
List<Integer> palabras = List.of(1, 2, 4, 4, 4);

Output (Salida):
[1, 2, 24]

#Ejercicio 42:
Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
●	La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su funcionamiento.
●	En ejemplo se muestra solo con 1 Alumno a modo de abreviar
●	En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)

Input (Entrada)
List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));

Output (Salida):
{"Simpson Homero"=30}


