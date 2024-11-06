/*
 * Mostrar una tabla de empleados
 * 
 * NOMBRE           EDAD        SALARIO
 * _____________________________________
 * 
 * Pedro             34         1550,56
 * Juan Carlos       45         2345,78
 * ...
 * 
 */
package entrada_salida;

public class TablaEmpleados {
    public static void main(String[] args) {
        //Encabezado de la tabla
        System.out.printf( "%-20s|%-10s|%-10s%n"        , "NOMBRE", "EDAD", "SALARIO");
        System.out.println ("------------------------------------------");
        System.out.printf( "%-20s|%-10d|%-10.2f%n"        , "Carlos", 30, 2500.50);
        System.out.printf( "%-20s|%-10d|%-10.2f%n"        , "Juan Carlos Roberto", 50, 1500.50);
        System.out.printf( "%-20s|%-10d|%-10.2f%n"        , "Juan Pedro Jose", 20, 3500.5045);
        
        

    }
    
}
