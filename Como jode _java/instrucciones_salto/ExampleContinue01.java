/*
 * La sentencia continue se utiliza para omitir la iteración actual 
 * en un bucle y continuar con la siguiente iteración. 
 * Cuando se encuentra una sentencia continue, el código restante 
 * dentro de la iteración actual se salta, y la condición del bucle 
 * se verifica nuevamente para determinar si debe continuar con la siguiente iteración.
 *
 */


public class ExampleContinue01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Salta la iteración cuando i es igual a 3
            }
            System.out.println(i);
        }
        
    }
}
