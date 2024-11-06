package repetitivos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        final String USUARIO = "admin";
        final String CONTRASENA_CORRECTA = "1234&";
        final byte MAX_INTENTOS =3;
        Scanner sc = new Scanner(System.in);
        int numIntentos =0;
        boolean accesoConcedido = false;
        String usuario, password;
        byte opcion;
                                            
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
        if (accesoConcedido == false){ //si no puede acceder pq gastó intentos 
            System.out.println("Ha agotado el número máximo de intentos. Acceso denegado"); 

        } else{ //si he accedido le presento el menú de opciones
            //presentamos el menú dentro de un bucle. Mostraremos todo el tiempo el menú
            //mientras la opción q el usuario elija sea distinto de 5 (opción salir)
            do {
                System.out.println("\n\n MENÚ DE OPCIONES: ");
                System.out.println("1) Suma");
                System.out.println("2) Resta");
                System.out.println("3) Multiplica");
                System.out.println("4) Divide");
                System.out.println("5) Salir");
                System.out.print("Escriba opción (1-5): ");
                opcion = sc.nextByte();
                if (opcion >=1 && opcion <=4){ //el usuario ha escrito nº 1,2,3,4
                    // ha seleccionado una operación
                    //le pedimos los numeros
                    System.out.println("Escriba primer nº: ");
                    double num1= sc.nextDouble();

                    System.out.println("Escriba segundo nº: ");
                    double num2= sc.nextDouble();

                    //en función de qué opción será una operación u otra
                    // 1. Suma 2. Resta 3. Multiplica 4. Divide
                    switch (opcion) {
                        case 1: //sumamos
                            System.out.println("La suma es: " + (num1+num2));    
                            break;                    
                        case 2: //restamos
                            System.out.println("La resta es: " + (num1-num2));    
                            break;
                        case 3: //multiplicamos                            
                            System.out.println("La multiplicación es: " + (num1*num2));    
                            break;
                        case 4: //dividimos
                            if (num2!=0){ //podremos dividir si el divisor no es cero                                
                                System.out.println("La división es: " + (num1/num2));   
                            }else{  
                                System.out.println("No es posible dividir por cero");
                            }
                    }                  
                }else if (opcion!=5){ //el usuario escribió otro número no contemplado en menú
                    System.out.println( "Ha seleccionado una opción incorrecta. Vuelva a intentarlo");
                }

            }while (opcion != 5); 

            System.out.println("Saliendo del programa");


        }

        sc.close();
    }
}
