/*
 * La sentencia break se utiliza para salir inmediatamente de un bucle, 
 * sin importar si la condición del bucle todavía es verdadera. 
 * Cuando se encuentra una sentencia break, la ejecución del bucle 
 * se detiene y el control se transfiere a la primera línea de código después del bucle.
 * 
 * OJO: NO DEBE USARSE ESTA INSTRUCCIÓN LA EXPLICAMOS POR SI ENCONTRAMOS CÓDIGO HECHO ASÍ
 *      PERO NO DEBE USARSE BREAK PARA UN FOR, USARÍAMOS OTRO TIPO BUCLE
 */



public class ExampleBreak01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Sale del bucle cuando i es igual a 5
            }
            System.out.println(i);
        }
        
    }
}
