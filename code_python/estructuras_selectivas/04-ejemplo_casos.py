# En Python no existe la estructura switch como 
# si tienen otros lenguajes de programación
# A partir de la versión 3.x de Python se 
# puede usar la sentencia match

# Ejemplo pedir un nº de 1 a 7 y mostrar el dia semana

dia = int(input ("Escribe nº dia (1-7): "))

match dia:
    case 1:
        print("Lunes")
    case 2:
         print("Martes")       
    case 3:
         print("Miércoles")       
    case 4:
         print("Jueves")       
    case 5:
         print("Viernes")   
    case 6:
         print("Sábado")       
    case 7:
        print("Domingo")   
    case _: # funciona como el default 
        print("Has escrito un nº no válido")

# NO ES NECESRIO PONER BREAK POR  CADA CASO COMO SÍ HACEMOS EN SWITCH DE JAVA