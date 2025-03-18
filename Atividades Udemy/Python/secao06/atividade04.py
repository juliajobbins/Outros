altura = float(input("Informe a sua altura: "))
sexo = input("Informe seu sexo (f/m): ")

if (sexo == 'm' or 'M'):
    pesoideal = (72.7 * altura) - 58
elif(sexo == 'f' or 'F'):
    pesoideal = (62.1 * altura) - 44.7
print(f"Seu peso idel é {pesoideal:.2f} kg.")
