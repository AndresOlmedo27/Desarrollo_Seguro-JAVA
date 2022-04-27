
from tkinter.tix import InputOnly
from xmlrpc.client import boolean


import re

validar = False
nombre = input("Introduce tu nombre: ")
# print(re.search("\d", nombre))
while(not validar):

    try:

        if(re.search("[^a-zA-Z]+[""]", nombre)):
            print("Introduce solo caracteres :)")
            nombre= input("Introduce tu nombre: ")
        else:
            print("Hola "+ nombre)
            validar = True
    except Exception:
        print("Ha ocurrido un error.")
        break
        

nombre1=nombre

apellido1 = input("Introduce tu primer apellido: ")

while(validar):
    try:

        if(re.search("[^a-zA-Z]+", apellido1)):
            print("Introduce solo caracteres :)")
            apellido1=input("Introduce tu primer apellido: ")
        
        else:
            print("Gracias " + nombre)
            validar=False
    except Exception:
            print("Ha ocurrido un error.")
            break

apellido11= apellido1

apellido2= input("Ahora introduce tu segundo apellido: ")

while(not validar):
    try:

        if(re.search("[^a-zA-Z]+", apellido2)):
            print("Introduce solo caracteres :)")
            apellido2 = input("Introduce tu segundo apellido: ")
        else:
            print("Gracias :D")
            validar=True
    except:
        print("Ha ocurrido un error.")
        break

apellido22=apellido2

print("Nombre y apellidos todo en mayúsculas: " +nombre1.upper()+ "\u0020" +apellido11.upper()+ "\u0020" +apellido22.upper())
print("Nombre y apellidos todo en minúsculas: " +nombre1.lower()+ "\u0020" +apellido11.lower()+ "\u0020" +apellido22.lower())
print("Primera letra solo en mayúsculas: " +nombre1.capitalize()+ "\u0020" +apellido11.capitalize()+ "\u0020" +apellido22.capitalize())