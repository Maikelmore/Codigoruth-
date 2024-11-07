package estructuras_selectivas;
//Ejemplo switch
public class SwitchExample {
    public static void main(String[] args) {
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break; // Termina el bloque del caso 1
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles"); // Este caso se ejecuta porque dia = 3
                break;
            default:
                System.out.println("Día no válido"); // Se ejecuta si no hay coincidencias con los casos
                break;
        }
    }
}