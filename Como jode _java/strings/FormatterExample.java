package cadenas;
import java.util.Formatter;
public class FormatterExample {
    public static void main(String[] args) {
        // Creación de un Formatter para formatear el texto
        Formatter formatter = new Formatter();

        // Colores ANSI para dar color al texto en la consola
        final String ANSI_RESET = "\u001B[0m";       // Reset de color al predeterminado
        final String ANSI_RED = "\u001B[31m";        // Color rojo
        final String ANSI_GREEN = "\u001B[32m";      // Color verde
        final String ANSI_YELLOW = "\u001B[33m";     // Color amarillo

        // Encabezado de la tabla en color amarillo
        System.out.printf(ANSI_YELLOW + "%-15s %-10s %-10s %-10s%n" + ANSI_RESET, "Nombre", "Edad", "Altura", "Peso");

        // Fila 1 con datos formateados en color verde
        formatter.format(ANSI_GREEN + "%-15s %-10d %-10.2f %-10.2f%n" + ANSI_RESET, "Juan", 28, 1.75, 70.5);
        System.out.print(formatter);

        // Limpiar el Formatter para reutilizarlo en la siguiente fila
        formatter = new Formatter();

        // Fila 2 con datos formateados en color rojo
        formatter.format(ANSI_RED + "%-15s %-10d %-10.2f %-10.2f%n" + ANSI_RESET, "Ana", 32, 1.62, 60.2);
        System.out.print(formatter);

        // Limpiar el Formatter para la siguiente fila
        formatter = new Formatter();

        // Fila 3 con datos formateados en color verde
        formatter.format(ANSI_GREEN + "%-15s %-10d %-10.2f %-10.2f%n" + ANSI_RESET, "Luis", 24, 1.80, 75.8);
        System.out.print(formatter);

        // Limpiar el Formatter para la siguiente fila
        formatter = new Formatter();

        // Fila 4 con datos formateados en color rojo
        formatter.format(ANSI_RED + "%-15s %-10d %-10.2f %-10.2f%n" + ANSI_RESET, "María", 29, 1.65, 63.4);
        System.out.print(formatter);

        // Cerrar el Formatter para liberar recursos
        formatter.close();
    }
}
