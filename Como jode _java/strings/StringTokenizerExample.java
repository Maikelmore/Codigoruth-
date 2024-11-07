package cadenas;
import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args) {
        
        // Ejemplo 1: Uso básico de StringTokenizer con el delimitador predeterminado (espacio)
        System.out.println("Ejemplo 1: Uso básico con espacio como delimitador");
        String texto1 = "Java es un lenguaje de programación";
        
        // Crea un StringTokenizer que dividirá el texto por espacios
        StringTokenizer tokenizer1 = new StringTokenizer(texto1);
        
        // Usa un bucle para imprimir cada token encontrado
        while (tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }
        System.out.println("--------------------------");

        // Ejemplo 2: Uso de StringTokenizer con un delimitador personalizado
        System.out.println("Ejemplo 2: Uso con delimitador personalizado (coma y espacio)");
        String texto2 = "Rojo, Azul, Verde, Amarillo, Naranja";
        
        // Crea un StringTokenizer que divide el texto por comas y espacios
        StringTokenizer tokenizer2 = new StringTokenizer(texto2, ", ");
        
        // Imprime cada token encontrado, sin incluir las comas ni los espacios
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }
        System.out.println("--------------------------");

        // Ejemplo 3: Uso de StringTokenizer para contar el número de tokens
        System.out.println("Ejemplo 3: Contar el número de palabras en una cadena");
        String texto3 = "Uno Dos Tres Cuatro Cinco";
        
        // Crea un StringTokenizer para contar las palabras
        StringTokenizer tokenizer3 = new StringTokenizer(texto3);
        int contador = tokenizer3.countTokens();
        
        // Imprime el número total de tokens (palabras)
        System.out.println("Número de palabras en la cadena: " + contador);
        System.out.println("--------------------------");

        // Ejemplo 4: Uso de StringTokenizer con delimitadores múltiples y muestra de tokens vacíos
        System.out.println("Ejemplo 4: Uso con múltiples delimitadores y muestra de tokens vacíos");
        String texto4 = "Java|Python||C++|JavaScript||Swift";
        
        // Crea un StringTokenizer que divide el texto por el delimitador "|"
        // En este caso, el último argumento "true" permite mostrar los tokens vacíos
        StringTokenizer tokenizer4 = new StringTokenizer(texto4, "|", true);
        
        // Imprime cada token, incluyendo aquellos vacíos
        while (tokenizer4.hasMoreTokens()) {
            String token = tokenizer4.nextToken();
            if (token.equals("|")) {
                // Indica si el token es el delimitador
                System.out.println("[Delimitador |]");
            } else {
                // Muestra el contenido del token (puede estar vacío)
                System.out.println("Token: " + (token.isEmpty() ? "[Vacío]" : token));
            }
        }
    }
}
