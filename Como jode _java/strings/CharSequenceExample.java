package cadenas;
public class CharSequenceExample {
    public static void main(String[] args) {
        // Creación de distintos tipos de CharSequence
        
        // CharSequence como String (cadena de texto inmutable)
        CharSequence texto1 = "Hola, mundo";
        
        // CharSequence como StringBuilder (cadena de texto mutable)
        CharSequence texto2 = new StringBuilder("Java es genial");
        
        // CharSequence como StringBuffer (cadena de texto mutable y segura para hilos)
        CharSequence texto3 = new StringBuffer("Aprendiendo CharSequence");

        // Información sobre texto1 (String)
        System.out.println("Texto: " + texto1); // Imprime el texto completo
        System.out.println("Longitud: " + texto1.length()); // Muestra la longitud del texto
        System.out.println("Carácter en la posición 5: " + texto1.charAt(5)); // Muestra el carácter en la posición 5
        System.out.println("Subsecuencia (0-4): " + texto1.subSequence(0, 4)); // Muestra la subsecuencia del índice 0 al 4
        System.out.println("Texto en String: " + texto1.toString()); // Convierte CharSequence a String y lo imprime
        System.out.println("--------------------------");

        // Información sobre texto2 (StringBuilder)
        System.out.println("Texto: " + texto2); // Imprime el texto completo
        System.out.println("Longitud: " + texto2.length()); // Muestra la longitud del texto
        System.out.println("Carácter en la posición 5: " + texto2.charAt(5)); // Muestra el carácter en la posición 5
        System.out.println("Subsecuencia (0-4): " + texto2.subSequence(0, 4)); // Muestra la subsecuencia del índice 0 al 4
        System.out.println("Texto en String: " + texto2.toString()); // Convierte CharSequence a String y lo imprime
        System.out.println("--------------------------");

        // Información sobre texto3 (StringBuffer)
        System.out.println("Texto: " + texto3); // Imprime el texto completo
        System.out.println("Longitud: " + texto3.length()); // Muestra la longitud del texto
        System.out.println("Carácter en la posición 5: " + texto3.charAt(5)); // Muestra el carácter en la posición 5
        System.out.println("Subsecuencia (0-4): " + texto3.subSequence(0, 4)); // Muestra la subsecuencia del índice 0 al 4
        System.out.println("Texto en String: " + texto3.toString()); // Convierte CharSequence a String y lo imprime
        System.out.println("--------------------------");
    }
}
