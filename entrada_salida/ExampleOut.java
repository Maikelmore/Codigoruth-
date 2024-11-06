/**
 * En la salida de datos ya hemos visto print y println
 * En este ejemplo vamos a utilizar printf
 * Sináxis general
 *      System.out.printf(String formatio, Object....)
 * 
 * formato: especificadores del tipo %s (cadena) %i (integer) ...
 * argumentos: valores especificos que se insertan en la cadena
 * 
 */

package entrada_salida;
public class ExampleOut{
    public static void main(String[] args) {
        //Mostrar con printf un valor entero
        int numero = 42;
        System.out.printf("El número es %d%n", numero);
        //System.out.printf("El número es %i", numero); //esta línea dara error

        /*Para números enteros el especificador que podemos encontrarnos es %d  
         *    %d: se utiliza para representar numeros enteros con base 10
         *    %i: OJO este es para otros lenguajes
        */

        final double PI = 3.14159;
        System.out.printf("El valor de PI es: %.2f%n", PI); 
        /**
         * Al escribir .2 estoy fuerza la salida a dos decimales nada mas
         * %f se utiliza para decimales
         * %n equivale al \n salto de línea
         */

         String nombre ="Pedro";
         System.out.printf("Hola %s!!%n", nombre);

         // mismo printf con varios valores
         System.out.printf("Nombre: %s, Edad: %d%n", nombre, numero );

         double estatura = 1.75;
         System.out.printf("Nombre: %s, Edad: %d, Estatura: %.2f metros%n", nombre, numero, estatura );

         //Ejemplos de alineaciones de texto
         
         //alineación por la derecha
         System.out.printf("'%10s'%n", "Hola");
         System.out.printf("'%10s'%n", "Hola Ruth");
         System.out.printf("'%10s'%n", "Hasta mañana");

         /*
          * %10s indica que se imprime 10 caracteres de ancho,
           y lo alinea a la derecha pq es la opción predeterminada

           si lo que muestra tiene menos caracteres que los 10 que he indicado
           lo completa con espacios
          */

        //alineación por la izquierda ponemos - delante del ancho que fijamos
        System.out.printf("'%-10s'%n", "Hola");
        System.out.printf("'%-10s'%n", "Hola Ruth");

        //alineación de múltiples cadenas
        System.out.printf("'%-10s' |  '%-10s'%n", "Hola", "Mundo");
        System.out.printf("'%-10s' |  '%-10s'%n", "Hola", "Otra cosa");
        
        //alineacion centrada con espacios de forma manual
        
        String texto = "Hola"; //texto que quiero centrar
        int ancho =10; //el ancho total de caracteres donde vamos a centrar Hola
        int longitudTexto = texto.length(); //método length me indica nº caracteres de la cadena texto
        int espaciosIzq = (ancho - longitudTexto) / 2; //cuántos espacios necesitamos a la izqda para centrar texto
        System.out.printf ("%" + espaciosIzq + "s%s%n", "", texto);

        //    %6s insertar 6 espacios en blanco a la izda

        // MENSAJES POR CONSOLA CON COLORES

        final String RED_COLOR ="\u001B[31m";
        final String RESET_COLOR = "\u001b[0m";
        final String YELLOW_COLOR ="\u001B[33m";

        System.out.println (RED_COLOR + "Este es color rojo");
        System.out.println ("Ahora hasta que on cambie todo es rojo!");
        System.out.println (RESET_COLOR + " Volvemos a la normalidad");

        System.out.println ("Hola " + RED_COLOR + " Juan " + RESET_COLOR + " bienvenido");
        System.out.println ("Adios " + YELLOW_COLOR + " Juan " + RED_COLOR + " vete a tu casa" + RESET_COLOR + ".");
        
    }
}