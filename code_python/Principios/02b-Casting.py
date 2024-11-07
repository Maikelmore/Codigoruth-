""""
El casting en Python se refiere a la conversión de un tipo de dato a otro. 

En Python, a veces necesitamos realizar operaciones entre diferentes tipos de datos y para ello
 es necesario convertir estos valores a un tipo de dato compatible. Python ofrece funciones de
conversión de tipos que permiten cambiar un tipo de dato a otro de manera sencilla.

Tipos de Casting en Python
    -Casting Implícito
    -Casting Explícito
"""

"""
1. CASTING IMPLICITO
El casting implícito es una conversión que realiza Python de forma automática sin intervención del programador. 
Python automáticamente convierte un tipo de dato a otro si no hay pérdida de información. 
Por ejemplo, cuando se suman un entero (int) y un número con punto flotante (float), Python convierte el int en float automáticamente.
"""

# Sumar un entero y un flotante
a = 5  # Entero
b = 2.5  # Flotante

resultado = a + b  # Python convierte automáticamente 'a' a 'float'
print(resultado)  # Salida: 7.5 (tipo de 'resultado' es 'float')

"""
Python convierte automáticamente a (un int) a un float porque el resultado debe poder representar la parte decimal
"""

"""
2. Casting Explícito
El casting explícito es cuando el programador realiza la conversión de un tipo de dato a otro usando funciones específicas 
para asegurar la compatibilidad. Es útil cuando necesitamos realizar una conversión que Python no hace automáticamente, 
o cuando queremos asegurarnos de que la conversión se realice correctamente.

Python ofrece varias funciones para hacer el casting explícito entre tipos de datos. Algunas de las funciones más comunes son:

    int(): Convierte un valor en un número entero (int).
    float(): Convierte un valor en un número con punto flotante (float).
    str(): Convierte un valor en una cadena de caracteres (str).
    bool(): Convierte un valor en un valor booleano (True o False).
"""
#De float a int:
numero_flotante = 3.9
numero_entero = int(numero_flotante)
print(numero_entero)  # Salida: 3 (se trunca la parte decimal)

#De str a int:
cadena = "42"
numero = int(cadena)
print(numero)  # Salida: 42

#De int a float:
numero_entero = 5
numero_flotante = float(numero_entero)
print(numero_flotante)  # Salida: 5.0

#De str a float:
cadena = "10.75"
numero = float(cadena)
print(numero)  # Salida: 10.75



#De int o float a str:
numero_entero = 25
texto = str(numero_entero)
print(texto)  # Salida: "25"

numero_flotante = 3.14
texto = str(numero_flotante)
print(texto)  # Salida: "3.14"


#De bool a str:
valor_booleano = True
texto = str(valor_booleano)
print(texto)  # Salida: "True"


#De int a bool:
numero = 0
valor_booleano = bool(numero)
print(valor_booleano)  # Salida: False (porque es 0)

numero = 5
valor_booleano = bool(numero)
print(valor_booleano)  # Salida: True (porque es distinto de 0)


#------------ Ejemplo completo conversion entre tipos
# Solicitar la edad del usuario y convertirla a un entero
edad_str = input("Introduce tu edad: ")  # Se recibe como cadena
edad = int(edad_str)  # Casting explícito de str a int
print(f"Tienes {edad} años.")

# Solicitar la altura y convertirla a flotante
altura_str = input("Introduce tu altura en metros (por ejemplo, 1.75): ")  # Se recibe como cadena
altura = float(altura_str)  # Casting explícito de str a float
print(f"Tu altura es {altura} metros.")

# Convertir un número a cadena para concatenar
numero = 42
cadena = str(numero)  # Convertir a cadena para mostrarla junto con texto
print("El número convertido a texto es: " + cadena)

# Convertir una cadena a booleano (comparando)
respuesta = input("¿Te gusta Python? (sí/no): ").strip().lower()
gusta_python = respuesta == "sí"  # Convertir a booleano usando comparación
print(f"¿Te gusta Python?: {gusta_python}")
