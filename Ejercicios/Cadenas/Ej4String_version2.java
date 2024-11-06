public class Ej4String_version2 {
    public static void main(String[] args) {
        final int MAX = 3; // Nº máximo de 'a'
        final char LETRA = 'a'; // Letra a buscar
        final char NUEVA_LETRA = 'i'; // Nueva Letra que sustituye a LETRA

        String cadena = "Vamos a ver qué sale de este cambio de letras";
        String subcadena1; // almacena la subcadena antes de la 'a'
        String subcadena2; // almacena la subcadena después de la 'a'

        int contador = 0; // lleva el control de cuántas 'a' estamos reemplazando
        int posicion = 0;
        int ultimaPosicion = 0;

        boolean hayMasLetra = true; // suponemos que vamos a tener LETRA dentro de frase

        while (contador < MAX && hayMasLetra == true) { // bucle que se ejecuta hasta que hayamos encontrado MAX 'a' y tengamos letras 'a'
            // buscamos la posicion de la letra 'a' desde la ultima vez
            posicion = cadena.indexOf(LETRA, ultimaPosicion);
            // si no encuentra la 'a' indexOf nos devuelve un -1
            if (posicion == -1) { // Si no encuntra otra LETRA 'a'
                hayMasLetra = false;
            } else {
                subcadena1 = cadena.substring(0, posicion); // parte de la cadena desde el inicio hasta la 'a'
                                                            // encontrada
                subcadena2 = cadena.substring(posicion + 1); // parte de la cadena desde después de la 'a' encontrada
                                                             // hasta el final

                cadena = subcadena1 + NUEVA_LETRA + subcadena2;
                // actualizamos la última posicion para que la próxima búsqueda empiece después
                // de la 'a' sustituida
                ultimaPosicion = posicion + 1;
                contador++; // contamos para indicar que se ha reemplazado

            }

        }
        System.out.println(cadena);

    }
}
