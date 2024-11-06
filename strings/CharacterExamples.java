/*
 * Clase Character
 * Ejemplo uso de clase Character
 * URL: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Character.html
 */
package strings;
 public class CharacterExamples {
    public static void main(String[] args) {
            //Creo objetos de la Clase Character
            Character   letterA = 'A'; //podría haber puesto Character letterA = new Character('A')
            Character letterB='b';
            Character digit = '5';
            Character whiteSpace =' ';

            //Muestro los valores
            System.out.println("LetterA: " + letterA);
            System.out.println("LetterB: " + letterB);
            System.out.println("Digit: " + digit);
            System.out.println("whiteSpace: " + whiteSpace);

            //Ejemplo de uso de los métodos más comunes que puedo encontrar clase Character

            //método isLetter me devolverá true o false si el caracter que le envío es una letra
            //si observas la ayuda verás que el método es declarado como static esto implica que 
            //es posible llamar al método con el nombre de la clase
            System.out.println("LetraA es una letra? " + Character.isLetter(letterA));
            System.out.println("digit es una letra? " + Character.isLetter(digit));

            //método isDigit comprueba si el carácter que le envío es un dígito
            System.out.println("LetraA es un dígito? " + Character.isDigit(letterA));
            System.out.println("digit es un dígito? " + Character.isDigit(digit));

            //método toLowerCase() le envío un carácter y convierte a minúsculas
            System.out.println("LetterA convertimos a min: " + Character.toLowerCase(letterA));

            //método isLowerCase me indicará con true/false si el char qeu le envío está en minúsculas o no
            System.out.println("¿Está en minúsculas? " + Character.isLowerCase(letterA));

            //método toUpperCase() le envío un carácter y convierte a MAYÚSCULAS
            System.out.println("LetterB convertimos a MAYUSCULAS: " + Character.toUpperCase(letterB));

            //método isUpperCase me indicará con true/false si el char qeu le envío está en MAYUSCULAS o no
            System.out.println("¿Está en mayúsculas? " + Character.isUpperCase(letterB));

            //método isWhitespace para conocer si es un espacio en blanco 
            System.out.println("whiteSpace es un espacio en blanco? " +Character.isWhitespace(whiteSpace));

            //método isLetterOrDigit para conocer si es letra o dígito
            System.out.println("la letraA es letra o número?? " + Character.isLetterOrDigit(letterA));
            System.out.println("La ! es letra o número?? " + Character.isLetterOrDigit('!'));
            
            //ejemplo de equals no aparece como static. Aquí llamaremos como nombre_objeto.nombre_metodo(..)
            //Cuadno el método es static lo podemos llamar como Character.nombre_metodo(...)
            if (letterA.equals(letterB)){
                System.out.println("La letraA y letraB son iguales");
            }else{
                System.out.println("La letraA y letraB NO son iguales");
            }





    }
 }