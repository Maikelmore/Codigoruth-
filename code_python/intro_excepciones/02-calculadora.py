
#Calculadora de División sin funciones
try:
    numerador = float(input("Introduce el numerador: "))
    denominador = float(input("Introduce el denominador: "))
    resultado = numerador / denominador
except ValueError:
    print("Error: Debes introducir un número válido.")
except ZeroDivisionError:
    print("Error: No se puede dividir entre cero.")
except Exception as e:
    print(f"Ocurrió un error inesperado: {e}")
else:
    print(f"El resultado de la división es: {resultado}")
finally:
    print("Fin de la operación.")


"""
Explicación:
El código funciona de la misma manera que el ejemplo anterior con funciones, pero ahora todo el flujo está dentro del cuerpo principal.
try contiene la lógica principal para solicitar la entrada y realizar la división.
except maneja diferentes tipos de errores: ValueError para entradas no numéricas, ZeroDivisionError para el intento de dividir entre cero, y Exception para cualquier otro error.
else solo se ejecuta si no ocurre ningún error, mostrando el resultado de la división.
finally siempre se ejecuta, para indicar el final de la operación.
"""