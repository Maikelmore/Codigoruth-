package cadenas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ExpresionRegularExamples{
    public static void main(String[] args) {
         // Ejemplo 1: Validación de correo electrónico
         System.out.println("Ejemplo 1: Validación de correo electrónico");
         String email = "ejemplo@dominio.com";
         String patronCorreo = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

/*
          
Cada parte de esta expresión cumple una función específica:

^: Marca el inicio de la cadena. Esto asegura que la expresión regular solo coincida si el patrón empieza desde el primer carácter de la cadena.

[\\w.-]+:

    \\w: Representa cualquier carácter alfanumérico (letras mayúsculas, minúsculas, dígitos) y el guion bajo (_).
    .: El punto (.) representa literalmente el carácter punto en este caso, permitiendo que el nombre del correo incluya puntos.
    -: Permite el uso del guion (-) en el nombre del correo.
    [\\w.-]: Al encerrar \\w, ., y - en corchetes ([]), se indica que cualquier combinación de estos caracteres es válida.
    +: Indica que el conjunto [\\w.-] puede aparecer una o más veces. Esto significa que el nombre del correo electrónico debe tener al menos un carácter y puede contener letras, dígitos, puntos y guiones, en cualquier combinación.
    @: Representa el símbolo arroba (@). Este carácter es obligatorio y marca el final del nombre de usuario en la dirección de correo.

[\\w.-]+ (segunda aparición):

    Se usa el mismo conjunto de caracteres (\\w, ., -) para definir la parte del dominio antes del último punto en el correo (por ejemplo, dominio en ejemplo@dominio.com).
    + nuevamente indica que debe haber al menos un carácter en esta parte del dominio.
    \\.:

El carácter punto (.) marca el comienzo de la extensión del dominio (por ejemplo, .com).
\\.: La barra invertida (\\) se usa para "escapar" el punto, ya que en expresiones regulares el punto es un metacarácter que representa cualquier carácter. Al escapar el punto (\\.), se asegura de que solo coincida con el carácter literal ..
[a-zA-Z]{2,}:

[a-zA-Z]: Este conjunto representa cualquier letra mayúscula o minúscula, permitiendo extensiones de dominio como .com, .org, .net, etc.
{2,}: Este cuantificador indica que debe haber al menos dos letras en la extensión del dominio. El {2,} permite extensiones más largas como .info o .museum, pero no extensiones de solo una letra.
$: Marca el final de la cadena. Esto asegura que toda la cadena corresponda a la expresión regular y no haya caracteres adicionales después de la extensión del dominio.

Esta expresión regular valida correos electrónicos comunes como:
    "ejemplo@dominio.com"
    "nombre.usuario@dominio.org"
    "usuario123@sub-dominio.net"
Pero rechazará correos que no cumplan con el patrón:
    "usuario@com" (extensión demasiado corta)
    "@dominio.com" (sin nombre de usuario)
    "usuario@dominio" (sin extensión de dominio)

          */
         
         // Compilar el patrón y crear el Matcher para la validación del correo
         Pattern patternEmail = Pattern.compile(patronCorreo);
         Matcher matcherEmail = patternEmail.matcher(email);
         
         if (matcherEmail.matches()) {
             System.out.println("Correo válido: " + email);
         } else {
             System.out.println("Correo no válido: " + email);
         }
         System.out.println("--------------------------");
 
         // Ejemplo 2: Buscar números en un texto
         System.out.println("Ejemplo 2: Buscar números en un texto");
         String textoConNumeros = "Mi número es 12345 y el de mi amigo es 67890";
         String patronNumero = "\\d+";

/*
  \\d representa cualquier dígito del 0 al 9. 
    En expresiones regulares, \d es un metacarácter que coincide con un solo dígito.
    Como las barras invertidas (\) tienen un significado especial en las cadenas de texto en Java, 
    necesitamos "escaparlas" utilizando \\. 
    Esto convierte \\d en una secuencia válida en Java para que la expresión regular reconozca \d como "un dígito".

  +:
    El símbolo + indica que la expresión anterior (en este caso \d) puede aparecer una o más veces.
    Esto significa que la expresión regular coincide con secuencias de uno o más dígitos consecutivos.

    Por tanto patronNumero:
      - busca cualquier grupo de uno o más dígitos en una cadena.
      - Esta expresión coincide con números enteros de cualquier longitud.

    Esta expresión regular coincide con los siguientes valores:
        "123": una secuencia de tres dígitos.
        "42": una secuencia de dos dígitos.
        "7": un solo dígito.
    Pero no coincide con cadenas que contienen caracteres no numéricos, como:
        "12abc": contiene letras.
        "abc": no contiene ningún dígito.
 */
         
         Pattern patternNumero = Pattern.compile(patronNumero);
         Matcher matcherNumero = patternNumero.matcher(textoConNumeros);
         
         // Encuentra e imprime todos los números en el texto
         while (matcherNumero.find()) {
             System.out.println("Número encontrado: " + matcherNumero.group());
         }
         System.out.println("--------------------------");
 
         // Ejemplo 3: Validación de fecha en formato DD/MM/YYYY
         System.out.println("Ejemplo 3: Validación de fecha (DD/MM/YYYY)");
         String fecha = "25/12/2023";
         String patronFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";



/*
 La expresión regular en String patronFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$"; está diseñada para validar una fecha en formato DD/MM/YYYY (día/mes/año), donde:
        DD: El día es un número entre 01 y 31.
        MM: El mes es un número entre 01 y 12.
        YYYY: El año es un número de cuatro dígitos.


^:

    Marca el inicio de la cadena. Esto asegura que la expresión regular solo coincida si el patrón comienza desde el primer carácter de la cadena.

(0[1-9]|[12][0-9]|3[01]):
    Esta parte valida el día (DD) del mes y permite números entre 01 y 31.
    0[1-9]: Coincide con cualquier número del 01 al 09.
    [12][0-9]: Coincide con los días del 10 al 29.
    3[01]: Coincide con los días 30 y 31.
    |: Es el operador "OR" en expresiones regulares, permitiendo que el día coincida con cualquiera de los tres grupos anteriores.
/:
    Representa el carácter de separación / entre el día y el mes.
    Al ser un carácter literal, no necesita ser escapado en este caso.
(0[1-9]|1[0-2]):
    Esta parte valida el mes (MM), permitiendo valores entre 01 y 12.
    0[1-9]: Coincide con los meses de 01 a 09.
    1[0-2]: Coincide con los meses 10, 11, y 12.
    Esta estructura asegura que los meses estén siempre en formato de dos dígitos, desde 01 hasta 12.
/:
    Este es el segundo carácter de separación / entre el mes y el año.
\\d{4}:
    \\d: Coincide con cualquier dígito del 0 al 9.
    {4}: Especifica que debe haber exactamente cuatro dígitos. Esto asegura que el año esté en el formato YYYY (por ejemplo, 2023).
    La doble barra invertida (\\) se usa en Java para escapar la \ en \d.
$:
    Marca el final de la cadena. Esto garantiza que la fecha esté completamente validada y que no haya caracteres adicionales después de YYYY.

Ejemplos de Fechas Válidas y No Válidas
Fechas Válidas:
    "25/12/2023": Día 25, mes 12, y año 2023.
    "01/01/2020": Día 01, mes 01, y año 2020.
    "31/10/1999": Día 31, mes 10, y año 1999.
Fechas No Válidas:
    "32/01/2020": El día 32 no es válido.
    "15/13/2023": El mes 13 no es válido.
    "01/01/20": El año no tiene cuatro dígitos.
    "1/1/2023": Los días y meses deben estar en formato de dos dígitos.


 */
         Pattern patternFecha = Pattern.compile(patronFecha);
         Matcher matcherFecha = patternFecha.matcher(fecha);
         
         if (matcherFecha.matches()) {
             System.out.println("Fecha válida: " + fecha);
         } else {
             System.out.println("Fecha no válida: " + fecha);
         }
         System.out.println("--------------------------");
 
         // Ejemplo 4: Buscar palabras que comienzan con mayúscula
         System.out.println("Ejemplo 4: Buscar palabras que comienzan con mayúscula");
         String texto = "Java es un Lenguaje de Programación";
         String patronPalabraMayuscula = "\\b[A-Z][a-z]*\\b";

/*
 \\b (inicio de palabra):

    \\b es un metacarácter que marca un límite de palabra, es decir, el inicio o el final de una palabra.
    En este caso, el \\b al comienzo indica que la expresión debe coincidir con el inicio de una palabra. Este límite ayuda a evitar coincidencias en partes de una palabra.
[A-Z]:
    Este conjunto representa cualquier letra mayúscula en el rango de A a Z.
    Especifica que la palabra debe comenzar con una letra mayúscula, ya que solo coincide con una letra inicial en mayúscula.
[a-z]*:
        Este conjunto representa cualquier letra minúscula en el rango de a a z.
    * es un cuantificador que significa "cero o más veces". Esto permite que, después de la letra mayúscula, haya cualquier número de letras minúsculas, incluidas cero.
    Por ejemplo, A, Hola, y Palabra coincidirán, pero 3D no, porque D no es seguida solo por minúsculas.
\\b (fin de palabra):
    Este \\b marca el final de la palabra. Asegura que la coincidencia termine en un límite de palabra.
    Esto significa que solo coincidirá con palabras completas y no con fragmentos dentro de una palabra.
En Resumen
    \\b[A-Z][a-z]*\\b busca cualquier palabra que comience con una letra mayúscula (A-Z) y que esté seguida únicamente por letras minúsculas (a-z).
    Coincidirá con palabras completas en las que la primera letra esté en mayúscula y el resto de las letras (si existen) estén en minúsculas.

Ejemplos de Coincidencias
La expresión regular coincide con las siguientes palabras:
    "Java": Comienza con J mayúscula seguida de letras minúsculas.
    "Hola": Comienza con H mayúscula seguida de letras minúsculas.
    "Mundo": Comienza con M mayúscula seguida de letras minúsculas.
Pero no coincidirá con palabras como:
    "JAVA": Todas las letras están en mayúscula.
    "java": Comienza con minúscula.
    "3D": Comienza con un número y luego tiene una mayúscula, sin letras minúsculas

 */
         
         Pattern patternPalabraMayuscula = Pattern.compile(patronPalabraMayuscula);
         Matcher matcherPalabraMayuscula = patternPalabraMayuscula.matcher(texto);
         
         // Encuentra e imprime todas las palabras que comienzan con mayúscula
         while (matcherPalabraMayuscula.find()) {
             System.out.println("Palabra encontrada: " + matcherPalabraMayuscula.group());
         }
         System.out.println("--------------------------");
 
         System.out.println("Ejemplo 4: Buscar palabras que comienzan con mayúscula (CON ACENTOS)");
         String texto2 = "Java es un Lenguaje de Programación";
         String patronPalabraMayuscula2 = "\\b[A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]*\\b";

    /*
     * 
     [A-ZÁÉÍÓÚÜÑ]: Coincide con cualquier letra mayúscula, incluyendo letras acentuadas y especiales en mayúscula.
     [a-záéíóúüñ]*: Coincide con cero o más letras minúsculas, incluyendo letras acentuadas y especiales.
     */
         
         Pattern pattern = Pattern.compile(patronPalabraMayuscula2);
         Matcher matcher = pattern.matcher(texto2);
         
         while (matcher.find()) {
             System.out.println("Palabra encontrada: " + matcher.group());
         }
     }
    
}