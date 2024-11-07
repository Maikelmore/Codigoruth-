"""
Ejemplo de uso de estructuras de control anidadas
 Se pide un número entero al usuario:
      Si el numero es par: se piden tantos números como el usuario indicó y se muestra la media
      Si el número es impar: se piden números hasta que el usuario escribe un nº negativo, entonces para y muestra cuántos números tecleó

"""

try:
    # Pedir al usuario un número entero
    numero = int(input("Introduce un número entero: "))

    if numero % 2 == 0:
        # Si el número es par
        suma = 0
        for i in range(numero):
            valor = int(input("Introduce número:  "))
            suma += valor
        media = suma / numero if numero != 0 else 0
        print("La media de los ", numero, " números es: ", media)
    else:
        # Si el número es impar
        contador = 0
        while True:
            valor = int(input("Introduce un número (escribe un número negativo para terminar): "))
            if valor < 0:
                break
            contador += 1
        print("Has introducido", contador, " números.")

except ValueError:
    print("Error: Debes introducir un número entero válido.")