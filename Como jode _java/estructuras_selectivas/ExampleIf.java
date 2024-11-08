/* Ejemplo del uso de la sentencia condicional if 
 * Sintaxis general del if
 * if (expresion_boolena){
 *      // conjunto acciones expresion=TRUE
 * 
 * }
 * 
 * Esta estructura la usaremos cuando tengamos que "hacer algo" solo si la condición es verdadera
 * 
 * Este ejemplo: muestra un mensaje de bienvenida si tiene 18 años. Si no los tiene no hay que hacer nada
*/
public class ExampleIf {
    public static void main (String[] args){
        int edad=25;
        final byte MAYOR_EDAD=18;
        if (edad>=MAYOR_EDAD){
            System.out.println ("Bienvenido puedes pasar eres mayor de edad");
        }
        System.out.println ("Fin del programa");

    }
    
}
