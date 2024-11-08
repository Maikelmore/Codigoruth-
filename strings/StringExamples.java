/**
 * Ejemplos de declaración e inicialización de objetos Strings
 * 
 * 
 */
package strings;

public class StringExamples {
    public static void main(String[] args) {
        // Forma 1: declaro el objeto String e inicializo con un literal
        String saludo = "Hola, mundo";

        // Forma 2: utilizar el operador new (crea una instancia u objeto de la Clase)
        String mensaje = new String (" Java es la caña!");

        // Forma 3: crear una cadena vacía
        String cadenaVacía ="";

        // Forma 4: objeto null
        String cadenaNula = null; 

        // Forma 5: a partir de un array de caracteres
        char[] caracteres = {'H', 'o','l','a'};
        String cadenaCaracteres =  new String (caracteres); // cadenaCaracteres = "Hola"

        //Forma 6: a partir de un array de caracteres indicando desde que posicion inicial y final
        String desdeParteCaracteres = new String (caracteres, 1, 3); // desdeParteCaracteres="ola"


        byte[] numBytes = {65,66,67,68}; //Representación ASCII 'A', 'B', 'C', 'D'
        String palabraBytes = new String(numBytes);

        //Podríamos revisar la Clase String y ver todos los métodos que tiene disponible con el nombre String
        //será el método constructor de objetos String 
        //URL: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html

        // Forma: crearme una cadena a partir de una variable que tenga un valor numérico
        int numero = 123;
        String cadenaNumero = String.valueOf(numero); //usamos el método valueOf para convertir a String cadenaNumero="123"

        boolean verdadero = true;
        String cadenaBooleano = String.valueOf(verdadero); //conviernte a cadena cadenaBooleano ="true"

        char letra ='J';
        String cadenaChar = String.valueOf(letra); //cadenaChar ="J"

        

        //Mostramos los valores de las variables de ejemplo

        System.out.println("saludo: " + saludo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("cadenaVacía: " + cadenaVacía);
        System.out.println("cadenaNula: " + cadenaNula);
        System.out.println("desdeParteCaracteres: " + desdeParteCaracteres);
        System.out.println("palabraBytes: " + palabraBytes);
        System.out.println("cadenaNumero: " + cadenaNumero);
        System.out.println("cadenaBooleano: " + cadenaBooleano);
        System.out.println("cadenaChar: " + cadenaChar);
        System.out.println(cadenaCaracteres);// Lo he puesto para quitar el error no se si se tiene que mostrar











    }
    
}
