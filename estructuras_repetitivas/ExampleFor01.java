/************************************* BUCLE FOR *********************+
 * Se utiliza cuando conocemos a priori cuántas veces se ejecuta el bucle
 * 
 * SINTAXIS GENERAL: 
 * for (inicialización; condición; expresión de actualización) {
    // Código a ejecutar en cada iteración
 * }
 * 
 * - inicialización: En esta parte, generalmente se inicializa una variable de control que 
 * se utilizará para llevar un seguimiento de las iteraciones del bucle. 
 * Esta inicialización solo se realiza una vez al comienzo del bucle.
 * 
 * - condición: Aquí se especifica la condición que debe ser verdadera para que el bucle 
 * siga ejecutándose. Si la condición es falsa al inicio, el bucle no se ejecutará en absoluto.
 * 
 * - expresión de actualización: Esta parte se usa para actualizar la variable de control 
 * en cada iteración. Puede ser un incremento (i++), decremento (i--), o cualquier otro tipo de actualización.
 * 
 * -Código a ejecutar en cada iteración: Aquí colocas el bloque de código que se
 *  ejecutará repetidamente mientras la condición sea verdadera.
 * 
 * Un ejemplo simple que imprime los números del 1 al 5 utilizando un bucle for:
 */

package estructuras_repetitivas;

public class ExampleFor01 {
    public static void main (String[] argumentos){
        final int MAX=10;
        for (int contador = 1; contador <= MAX; contador++) {
            System.out.println(contador);
        }
    }
}
