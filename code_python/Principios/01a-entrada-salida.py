# Fecha: 18/10/24
# RLR

'''
Comentarios de varias líneas
'''
'''--------------------------------------------
Python no es necesario finalizar las instrucciones en ;
Los comentarios de una línea es con la #
print (mensaje_mostrar)


'''

print ("*******EJEMPLOS DE SINTAXIS BÁSICA PYTHON************")
print ("Esto es un mensaje1")
print ("Esto es un mensaje2")
print ("Esto es un mensaje3");print ("Esto es un mensaje4")
print("Esto es un mensaje muy largo que puede resultar dificil \
    o incómodo de leer para el desarrollador")


nombre = input("Por favor, escribe tu nombre: ")
print (nombre)
print ("Hola " + nombre)
print ("Hola " + nombre + " bienvenida a esta clase de Python")
print ("Hola %s como estas" %nombre )

numero =19 #ejemplo de vble int
#print ("Numero: " + numero) #ERROR NO PODEMOS HACERLO
print("Numero: ", numero)
print("El numero %i es el guardado" %numero) #%i porque es entero
print("Numero " + str(numero)) #str(19) devuelve "19"

altura = 1.75 #ejemplo vble float
print("Tienes %f de altura" %altura)
print("%s tiene %f de altura" %(nombre, altura))
print("%s tiene %.2f de altura" %(nombre, altura)) #%.2f dos dígitos depués del punto

#OJO CON MAY/MIN DE LAS VARIABLES
Nombre = "Juan"
NOMBRE="Pepe"
print(Nombre)
print(nombre)
print(NOMBRE)

#también podemos usar la función format de un String. Ya lo iremos aprendiendo
print("Mi nombre es {} tengo {} años y mido {} cm".format(nombre, numero, altura))



