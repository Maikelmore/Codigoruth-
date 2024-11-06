import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los nombres y precios de tres productos
        System.out.print("Introduce el nombre del primer producto: ");
        String producto1 = sc.nextLine();
        System.out.print("Introduce el precio de " + producto1 + ": ");
        double precio1 = sc.nextDouble();
        sc.nextLine();  // Limpiar el buffer

        System.out.print("Introduce el nombre del segundo producto: ");
        String producto2 = sc.nextLine();
        System.out.print("Introduce el precio de " + producto2 + ": ");
        double precio2 = sc.nextDouble();
        sc.nextLine();  // Limpiar el buffer

        System.out.print("Introduce el nombre del tercer producto: ");
        String producto3 = sc.nextLine();
        System.out.print("Introduce el precio de " + producto3 + ": ");
        double precio3 = sc.nextDouble();

        // Mostrar los datos en formato de tabla
        System.out.printf("%n%-15s | %-7s%n", "Producto", "Precio");
        System.out.println("-----------------------------");
        System.out.printf("%-15s | %7.2f €%n", producto1, precio1);
        System.out.printf("%-15s | %7.2f €%n", producto2, precio2);
        System.out.printf("%-15s | %7.2f €%n", producto3, precio3);

        /*
         * 
         * NOTA: El problema de que el símbolo del euro (€) no aparezca correctamente y se muestre como un símbolo de interrogación (?) puede estar relacionado con el conjunto de caracteres (encoding) que está utilizando el IDE
         * Si te sucede esto: Asegúrate de que la consola esté configurada para usar UTF-8.
         * chcp 65001 //ejecutar eso en la consola
         * Si no funciona File - Preferences - Settings- Abrir settings.json y poner el siguiente código
         * Abrir setting.json CTRL + SHIFT + P {setting.json} --- espacio trabajo
         *
 {
    "editor.fontVariations": false,
    "terminal.integrated.shellArgs.windows": ["/K", "chcp 65001"],
    "terminal.integrated.defaultProfile.windows": "Command Prompt",
    "terminal.integrated.profiles.windows": {
        "Command Prompt": {
            "path": ["${env:windir}\\System32\\cmd.exe"],
            "args": ["/K", "chcp 65001"]
        },
        "PowerShell": {
            "source": "PowerShell",
            "icon": "terminal-powershell"
        }
    },
    "files.encoding": "utf8"
}


         */

     
    }
}
