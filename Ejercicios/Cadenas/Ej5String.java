public class Ej5String {
    public static void main(String[] args) {
        String cadena = "Esta es una cadena cualquiera";
        String cadenaReves="";
        for (int posicion=cadena.length()-1; posicion>=0; posicion--){
            cadenaReves += cadena.charAt(posicion);
        }
        System.out.println(cadena);
        System.out.println(cadenaReves);
    }
}
