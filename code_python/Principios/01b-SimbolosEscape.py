"""
Programa para demostrar el uso de los símbolos de escape

Los símbolos de escape en Python se utilizan dentro de cadenas de texto para representar caracteres especiales que no se pueden escribir directamente. Estos símbolos comienzan con una barra invertida (\). A continuación, te muestro algunos de los símbolos de escape más comunes en Python:

\' : Comilla simple
\" : Comilla doble
\\ : Barra invertida
\n : Nueva línea (salto de línea)
\t : Tabulador (espacio horizontal)
\r : Retorno de carro
\b : Retroceso
\f : Salto de página
\a : Campana (alerta sonora)
\v : Tabulador vertical
"""

#

print("Ejemplos de símbolos de escape en Python:")

# Nueva línea (\n)
print("Este es un ejemplo de\nsalto de línea.")

# Tabulador (\t)
print("Este es un ejemplo de\ttabulación.")

# Comillas simples y dobles
print('Esto es un ejemplo con una comilla simple: \'')
print("Esto es un ejemplo con una comilla doble: \"")

# Barra invertida
print("Esto es una barra invertida: \\")

# Campana (\a)
print("Este es un ejemplo de campana (alerta sonora): \a")

# Combinando varios
print("Combinación de símbolos de escape:\n\t\"Nueva línea y tabulación con comillas dobles\"")

# Carácter Unicode
print("Carácter Unicode \N{snowman}: ☃️")  # Se imprime un muñeco de nieve. Para más info consultar https://docs.python.org/3/howto/unicode.html

