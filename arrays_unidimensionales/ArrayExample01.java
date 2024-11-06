/*
 * USO DE ARRAYS UNIDIMENSIONALES
 * 
 * Sintaxis general:
 *   tipo_dato[] nombre_array;
 *      o
 *   tipo_dato nombre_array[];
 * 
 * Ejemplos:
 *   String[] nombres = new String[10] //vector que almancena 10 nombres
 *   }
 */

package arrays_unidimensionales;

import java.util.Scanner;

public class ArrayExample01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        //Ejemplo array de enteros para guardar 5 edades
        int[] edades = new int[5]; //array de 5 posiciones de 0 a 4, puedo almacenar enteros. Inicialmente, se asigna el valor por defecto del tipo En este caso 0

        //guardo datos
        edades[0]=35; //guarda la primera edad en la posición 0
        edades[1]=45;
        edades[2]=5;

        //muestro datos
        System.out.println("Las edades son: " + edades); //no me muestra los valores
        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]); //muestra 0 pq no asigné valor pone el dato por defcto para su tipo al ser entero 0
        System.out.println(edades[4]);


        //Ejemplo02 vector con letras
        char letras[]; //otra forma de declarar arrays
        letras = new char[3]; //dimensiono a 3 letras

        letras[0] ='e';
        letras[1]='4';
        System.out.println("\n\nEjemplo 2, vector letras tiene: ");
        System.out.println(letras[0]);
        System.out.println(letras[1]);
        System.out.println(letras[2]); //no había asignado valor ''


        //Ejemplo03 vector con cadenas de la clase String
        String[] nombres = {"Juan", "Pablo", "Maria"}; //declara e inciializa con valores. En ese momento, está dimensionando cuántos elmentos tiene
        System.out.println("\n\nEjemplo 3 Vector con cadenas String:");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        //System.out.println(nombres[3]); Esto da error pq no existe esa posición


        //Ejemplo 04 vector con numeros decimales
        double[] precios = {19.99, 23.45, 5.99, 12.99}; //vector que almacena 4 precios distintos
        System.out.println("\n\nEjemplo  Vector con precios:");
        System.out.println(precios[0]);
        System.out.println(precios[1]);
        System.out.println(precios[2]);
        System.out.println(precios[3]);

        //Ejemplo 05 vector que almacena valores booleanos
        boolean[] valores ={true, false, true, true};
        System.out.println("\n\nEjemplo  Vector con booleanos:");
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);

        //Los vectores tienen una propiedad que nos será muy útil y es la propiedad length
        //nos indicará el nº elementos que tiene
        // OJO ES UNA PROPIEDAD .length NO ES UN MÉTODO .length () ES DECIR AQUI NO SE USAN LOS () 

        System.out.println("El vector precios tiene " + precios.length + " elementos Precios[0]=" + precios[0] + " Precios[1]=" + precios[1]);
        System.out.println("El vector edades tiene " + edades.length + " elementos.");
        System.out.println("El vector valores tiene " + valores.length + " elementos.");
        System.out.println("El vector nombres tiene " + nombres.length + " elementos.");


        //ejemplo de cómo recorrer un vector para mostrar información
        for (int i=0; i< edades.length; i++){ //muestra todas las edades
            System.out.println("Edad en la posición " + i + " es: " + edades[i]);
        }


        //pedir nuevos caracteres y guardarlos en el vector letras
        int posicion;
        for (posicion=0;posicion<letras.length;posicion++){
                System.out.print("Escribe la letra: ");
                letras[posicion]= sc.next().charAt(0); //leo un caracter
        }

        //mostramos los caracteres nuevos
        System.out.println("Ahora el vector letras tiene: ");
        for (posicion=0;posicion<letras.length;posicion++){
            System.out.print(letras[posicion] + " ");           
        }

        //pido nuevas edades y las guardo en su vector
        for (posicion=0; posicion<edades.length;posicion++){
            System.out.print("\nEscribe la edad: ");
            edades[posicion] = sc.nextInt();
        }

        System.out.println("Ahora el vector edades tiene: ");
        for (posicion=0;posicion<edades.length;posicion++){
            System.out.print(edades[posicion] + " ");           
        }

        //TENEMOS OTRA VERSIÓN DEL FOR PARA RECORRER VECTORES O COLECCIONES QUE VEREMOS MÁS ADELANTE
        //VERSIÓN for - each

        //Vamos a mostrar el contenido del vector edades con la versión for each
        for (int edad: edades){
            System.out.println("Edad: " + edad);
        }

        //Ahora muestro las letras con for-each
        //recorre todos los elementos del vector, elemento a elemento
        for (char caracter: letras){
            System.out.println("Letra: " + caracter);
        }



        sc.close();

    }
}
