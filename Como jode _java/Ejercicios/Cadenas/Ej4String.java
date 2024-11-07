public class Ej4String {
    public static void main(String[] args) {
        String cadena = "Vamos a ver qué sale de este cambio de letras";
        String fraseCambiada= cadena.substring(0, 30).replace('a', 'i');
        String fraseCombinada = fraseCambiada.concat(cadena.substring(30));
        System.out.println(fraseCombinada);

    }
}
