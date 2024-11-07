/*
 * Para acceder a una aplicación se deberá escribir el nombre de usuario admin y 
la contraseña 1234&. Hasta que el usuario no escriba la contraseña correcta o 
haya agotado 3 intentos se le solicitará el user y password. 
 */
package repetitivos;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        final String USUARIO = "admin";
        final String CONTRASENA_CORRECTA = "1234&";
        final byte MAX_INTENTOS =3;
        Scanner sc = new Scanner(System.in);
        int numIntentos =0;
        boolean accesoConcedido = false;
        String usuario, password;
                                            
        while (numIntentos<MAX_INTENTOS && accesoConcedido == false ){ //mientras las dos condiciones sean ciertas le pediré usuario y pass
            System.out.print("Escriba nombre de usuario: ");
            usuario =   sc.nextLine();
            System.out.println("Escriba la contraseña: "   );
            password = sc.nextLine();

            //si el nombre usuario y la constraseña están correctas se le permitirá el acceso, por tanto cambio el valor de accesoCondedido a TRUE
            if (usuario.equals(USUARIO) && password.equals(CONTRASENA_CORRECTA)){
                accesoConcedido = true;
                System.out.println("Acceso concedido");
            }else{ //si no se cumple la condición anterior se debe sumar un itnento
                numIntentos++; //sumamos un intento
                System.out.println("Usuario o contraseña incorrectos. Le quedan " + (MAX_INTENTOS - numIntentos) + " intentos");
            }
        }
        if (accesoConcedido == false) System.out.println("Ha agotado el número máximo de intentos. Acceso denegado");

        sc.close();
    }
}
