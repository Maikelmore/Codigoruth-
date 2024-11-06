/************************************* BUCLE WHILE *********************+
Se utiliza cuando no sabemos cuántas veces se ejecuta.

Como mínimo puede que no se ejecute ninguna vez.

while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}

condición: En esta parte, se especifica una condición que debe ser verdadera para que el bucle se ejecute. Si la condición es falsa al comienzo, el bucle no se ejecutará en absoluto.

Código a ejecutar mientras la condición sea verdadera: Aquí colocas el bloque de código que se ejecutará repetidamente mientras la condición sea verdader

Un ejemplo simple que imprime los números del 1 al 5 utilizando un bucle while:
 */

package estructuras_repetitivas;



public class ExampleWhile01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++; //esta línea es equivalente a i=i+1
        }
    }
}

