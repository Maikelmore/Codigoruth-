/*
 * Dada la siguiente frase “Esta es una frase completa de principio a fin”, obtener dos Strings, 
 * uno que contenga sólo las palabras impares y otro las pares. Al final mostrar el String original,
 * el de las palabras impares y el de las pares. La primera palabra es la que ocupa la posición 1.
 */
class Ejercicio1String2{
    public static void main(String[] args) {

        String frase = "Esta es una frase completa de principio a fin";
        String palabrasImpares = ""; //en esta variable guardamos las palabras que están en las posiciones impares
        String palabrasPares = "";//en esta variable guardamos las palabras que están en las posiciones pares

        int conteoPalabras = 1; //variable que contabiliza las palabras dentro de la frase
        int inicio = 0; //variable que indica la posición del caracter donde empieza la palabra

        // Recorremos cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            // Al llegar a un espacio o al último carácter de la frase
            if (frase.charAt(i) == ' ' || i == frase.length() - 1) {
                // Si estamos en el último carácter, incluimos este carácter en la palabra
                String palabra = i == frase.length() - 1 ? frase.substring(inicio, i + 1) : frase.substring(inicio, i);

                if (conteoPalabras % 2 != 0) {
                    palabrasImpares += palabra + " ";
                } else {
                    palabrasPares += palabra + " ";
                }
                conteoPalabras++;
                inicio = i + 1;  // Actualizar el índice de inicio de la próxima palabra
            }
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Palabras impares: " + palabrasImpares.trim());
        System.out.println("Palabras pares: " + palabrasPares.trim());
    }
}