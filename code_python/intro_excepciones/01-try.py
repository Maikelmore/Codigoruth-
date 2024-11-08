"""
Programa que pide un número al usuario
Controla la excepción de si introduce un dato que no sea numerico
"""
try:
    numero = int(input("Introduce un número: "))
    print("Has introducido el número: ", numero)
except ValueError:
    print("Error: El valor introducido no es un número válido.")


"""
Explicación:
try:

Dentro del bloque try, intentamos convertir la entrada del usuario (input()) a un número entero usando int().
Si el usuario introduce algo que no es un número válido (por ejemplo, letras o símbolos), se producirá una excepción ValueError.
except ValueError:

Cuando ocurre un ValueError, el bloque except captura esa excepción y muestra un mensaje adecuado al usuario, indicando que el valor introducido no es válido.

"""


"""
Las excepciones en Python permiten capturar y manejar diferentes tipos de errores para evitar que el programa se detenga de manera inesperada. Los tipos más comunes incluyen:

Errores relacionados con tipos y valores: ValueError, TypeError, IndexError, KeyError.
Errores matemáticos: ZeroDivisionError, OverflowError.
Errores de archivo: FileNotFoundError, PermissionError.
Errores de importación: ImportError, ModuleNotFoundError.
Errores de atributos y nombres: AttributeError, NameError.
Errores generales: MemoryError, RecursionError, RuntimeError, AssertionError.
Entender y manejar excepciones adecuadamente es clave para crear programas más robustos y confiables, que puedan gestionar errores inesperados sin fallar abruptamente.
"""