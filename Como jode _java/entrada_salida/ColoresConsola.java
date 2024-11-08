package entrada_salida;

public class ColoresConsola {

    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_UNDERLINE = "\u001B[4m";
        final String ANSI_INVERT = "\u001B[7m";
        // Ejemplo 1: Colores básicos
        System.out.println(ANSI_RED + "Este texto es rojo" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Este texto es verde" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Este texto es amarillo" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Este texto es azul" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "Este texto es púrpura" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Este texto es cian" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "Este texto es blanco" + ANSI_RESET);

        // Ejemplo 2: Texto con estilos
        System.out.println(ANSI_BOLD + "Este texto está en negrita" + ANSI_RESET);
        System.out.println(ANSI_UNDERLINE + "Este texto está subrayado" + ANSI_RESET);
        System.out.println(ANSI_INVERT + "Este texto tiene el fondo y texto invertidos" + ANSI_RESET);

        // Ejemplo 3: Combinación de colores y estilos
        System.out.println(ANSI_RED + ANSI_BOLD + "Este texto es rojo y en negrita" + ANSI_RESET);
        System.out.println(ANSI_BLUE + ANSI_UNDERLINE + "Este texto es azul y subrayado" + ANSI_RESET);
    }
}
