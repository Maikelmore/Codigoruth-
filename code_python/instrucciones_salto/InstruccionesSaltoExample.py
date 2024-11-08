
# InstruccionesSaltoExample.py
# Este archivo contiene ejemplos de uso de las instrucciones de salto en Python:
# break, continue y pass, con comentarios explicativos.

# Ejemplo de uso de 'break':
# Este bucle for imprimirá números del 0 al 4, pero se detendrá al alcanzar el 5
for i in range(10):
    if i == 5:
        break  # Se detiene el bucle cuando i es igual a 5
    print("Usando break, i es:", i)
# Salida esperada: 0, 1, 2, 3, 4
# ATENCIÓN: EL EJEMPLO ANTERIOR NO DEBERÍA PROGRAMARSE CON UN BUCLE FOR, DEBERÍA UTILIZAR OTRO BUCLE. ESTO NO SE DEBE UTILIZAR.
# QUIÉN PONGA UN BREAK DE ESTA FORMA SERÁ CALIFICADO CON UN 0. HAY QUE UTILIZAR LAS ESTRUCTURAS ADECUADAS

print()  # Línea en blanco para separar salidas

# Ejemplo de uso de 'continue':
# Este bucle for imprimirá solo números impares entre 0 y 9,
# saltando los números pares gracias a la instrucción continue
for i in range(10):
    if i % 2 == 0:
        continue  # Pasa a la siguiente iteración cuando i es par
    print("Usando continue, i es:", i)
# Salida esperada: 1, 3, 5, 7, 9

print()  # Línea en blanco para separar salidas

# Ejemplo de uso de 'pass':
# Este bucle for simplemente imprime cada número, pero cuando i es igual a 3,
# no realiza ninguna acción específica gracias a 'pass'
for i in range(5):
    if i == 3:
        pass  # No hace nada, pero el bucle continúa
    print("Usando pass, i es:", i)
# Salida esperada: 0, 1, 2, 3, 4

# Fin del archivo
