
package entrada_salida;
public class TablaEmpleadosv2 {
    public static void main(String[] args) {
        
         // Encabezado de la tabla
        // %-20s: Alinea el texto (nombre) a la izquierda en un campo de 20 caracteres
        // %-10s: Alinea el texto (edad y salario) a la izquierda en un campo de 10 caracteres
        System.out.printf("%-20s|%-10s|%-10s%n", "NOMBRE", "EDAD", "SALARIO");
        // Línea separadora para la tabla
        System.out.println("------------------------------------------");

        // Datos de la primera fila
        String nombre1 = "Carlos";
        int edad1 = 30;
        double salario1 = 2500.50;

        // Datos de la segunda fila
        String nombre2 = "Juan Carlos Roberto";
        int edad2 = 50;
        double salario2 = 1500.50;

        // Datos de la tercera fila
        String nombre3 = "Juan Pedro Jose";
        int edad3 = 20;
        double salario3 = 3500.5045;

        // Ancho total de la columna de la edad
        int anchoEdad = 10;

        // ===================== Primera fila =====================
        // Convertir la edad en cadena de texto para calcular su longitud
        String edadString1 = Integer.toString(edad1);

        // Calcular cuántos espacios a la izquierda necesitamos para centrar la edad
        int espaciosIzquierda1 = (anchoEdad - edadString1.length()) / 2;

        // Imprimir la primera fila
        // %-20s: Alinea el nombre a la izquierda en un campo de 20 caracteres
        // %espaciosIzquierda1 + "s": Inserta un número de espacios calculados antes de la edad
        // %s: Imprime la edad
        // %anchoEdad - espaciosIzquierda1 - edadString1.length() + "s": Inserta espacios a la derecha para completar el campo de 10 caracteres
        // %-10.2f: Alinea el salario a la izquierda en un campo de 10 caracteres con 2 decimales
        System.out.printf("%-20s|%" + espaciosIzquierda1 + "s%s%" + (anchoEdad - espaciosIzquierda1 - edadString1.length()) + "s|%-10.2f%n", 
                          nombre1, "", edadString1, "", salario1);

        // ===================== Segunda fila =====================
        String edadString2 = Integer.toString(edad2);
        int espaciosIzquierda2 = (anchoEdad - edadString2.length()) / 2;

        System.out.printf("%-20s|%" + espaciosIzquierda2 + "s%s%" + (anchoEdad - espaciosIzquierda2 - edadString2.length()) + "s|%-10.2f%n", 
                          nombre2, "", edadString2, "", salario2);

        // ===================== Tercera fila =====================
        String edadString3 = Integer.toString(edad3);
        int espaciosIzquierda3 = (anchoEdad - edadString3.length()) / 2;

        System.out.printf("%-20s|%" + espaciosIzquierda3 + "s%s%" + (anchoEdad - espaciosIzquierda3 - edadString3.length()) + "s|%-10.2f%n", 
                          nombre3, "", edadString3, "", salario3);
    }
}
