package estructuras_selectivas;
// Ejemplo de estructura condicional IF-ELSEIF
public class IfElseIfExample {
    public static void main(String[] args) {
        int numero = 0;
        if (numero > 0) {
            System.out.println("El número es positivo"); // Se ejecuta si numero es mayor que 0
        } else if (numero < 0) {
            System.out.println("El número es negativo"); // Se ejecuta si numero es menor que 0
        } else {
            System.out.println("El número es cero"); // Se ejecuta si numero es igual a 0
        }
    }
}
