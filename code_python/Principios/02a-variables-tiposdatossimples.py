# Fecha Oct 24
# VARIABLES Y TIPOS DE DATOS SIMPLES
# Tipos datos primitivos:
# - Números: entero (6), decimal (6.7) o complejo (23+4i)
# - Cadenas: comas dobles o comas simples "" ''
# - Booleanos: true/false

#En Python nos es necesario definir el tipo de dato de la variable
#Simplemente con asignar un valor el intérprete es capaz de reconocerlo

#Sintaxis general:
#identificador_variable = valor

#------ EJEMPLOS
numero =10
print(numero)

#asignar múltiples valores a múltiples variables
num1, num2, mensaje = 5,13, "Hola"
print(num1)
print(num2)
print(mensaje)


salida = continuar = True  #dos vbles booleanas y asigno True a las dos
print(salida) #salida es True
print(continuar) #salida es True

salida = False
print(salida) #salida es False

#Tenemos función type(nombre_vble) que nos indica el tipo de dato que tiene la vble
print("Vamos a conocer los tipos de datos de las variables creadas")
print (type(salida))
print (type(numero))
print (type(mensaje))

#En Python tenemos palabras reservadas
help("keywords") #muestra todas las palabras reservadas de Python
'''
False               class               from                or
None                continue            global              pass
True                def                 if                  raise
and                 del                 import              return
as                  elif                in                  try
assert              else                is                  while
async               except              lambda              with
await               finally             nonlocal            yield
break               for                 not

'''

#-------------------------------------- Ejemplos de numeros
entero = 7
print(entero, type(entero))

decimal = 1.35
print(decimal, type(decimal))

otroNum = 0.5e-3 #este numero tiene exponente en base 10. Es decir multiplicado por 10 elevado a n
print(otroNum, type(otroNum))

numComplejo = 2 + 3.14j
print(numComplejo, numComplejo.imag, numComplejo.real, type(numComplejo ))

# Casting conversión de tipos de datos en Python  
print(int(decimal)) #muestra 1
print(float(entero)) #muestra 7.0
print(complex(entero)) #muestra 7+0j

# ----------------------------------- Ejemplos de booleanos

booleanaT, booleanaF = True, False #declaro dos variables e inicializo
print ("El valor de booleanaT es ", booleanaT, " y es de tipo ", type(booleanaT))
print ("El valor de booleanaF es ", booleanaF, " y es de tipo ", type(booleanaF))

# 0 equivale a False
# 1 equivale a True

# Función bool para convertir a booleano
print(bool(0)) #imprime False
print(bool(1)) #imprime True

# Ojo en Python la cadena vacía es equivalente a False
print(bool("")) #imprime False

# --------------------------------- Ejemplos de cadenas
cadena1 = 'Esto es un texto entre comillas simples'
print(cadena1, type(cadena1))

cadena2 = "Esto es un texto entre comillas simples"
print(cadena2, type(cadena2))

cadena3 = "Cadenas con símbolo de escape \n esto es otra línea \t ahora tabulo"
print(cadena3)

# cadena en varias líneas con tres comillas dobles
cadena4 = """Texto en línea 1
línea 2
línea 3
"""
print(cadena4)









