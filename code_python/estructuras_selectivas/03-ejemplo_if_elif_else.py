# Ejemplo if-elif[else]
# Pedir nº al usuario e indicar si es par o impar. Contempla el 
# caso que num=0

numero = int(input ("Escribe nº: "))
if (numero==0): #compruebo si es cero
    print("Número es cero")
elif (numero%2==0):
    print("Número par")
else:
    print ("Número es impar")
    
print ("Fin del programa. Adios")