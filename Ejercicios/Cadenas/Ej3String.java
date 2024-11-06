public class Ej3String {
    public static void main(String[] args) {
        String cadena ="A ver cuántos asteriscos salen de aquí";
        String subcadena1, subcadena2;
        //recorremos la cadena desde la posicion 0 hasta el final
        //saltanto de 5 caracteres
        for (int posicion=0; posicion<cadena.length();posicion=posicion+5){
            subcadena1 = cadena.substring(0, posicion);
            subcadena2=cadena.substring(posicion+1);
            cadena = subcadena1 + "*" + subcadena2;

        }
        System.out.println("La cadena con * es: " + cadena);
    }
}
