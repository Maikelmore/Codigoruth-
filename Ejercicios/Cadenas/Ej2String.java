public class Ej2String {
    public static void main(String[] args) {
        String cadena = "Esta es una frase cualquiera";

        for (int posicion=0;posicion<cadena.length();posicion=posicion+5){
            //este bucle se ejecuta desde la letra 0 de la cadena
            //hasta la letra N-1 siendo N el nº de caracteres de la frase
            System.out.println("Letra en la posicion " + posicion + " es: " + cadena.charAt(posicion));
        }         
        

    }
}
