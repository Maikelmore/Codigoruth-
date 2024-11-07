# Ejemplo de if
# Pedir un nº al usuario, si es negativo mosgtramos el valor absoluto del número

num = int(input ("Escribe nº: ")) #pedimos el nº y lo convierto a int
if (num<0):
    print ("El valor absoluto del número ", num, " es ", num*(-1))

print ("Fin del programa. Hasta pronto ")

"""OBSERVACIÓN:
    En Python a diferencia de otros lenguajes como Java, C++ no se 
    utilizan {} para delimitar bloques de código.
    En su lugar Python utiliza la INDENTACION para determinar qué
    pertenece a cada bloque.
        
    
"""