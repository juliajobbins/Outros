vetor = []
maior50 = False

for i in range (0,10):
    numero = int(input(f"Informe o {i+1}º valor para o vetor: "))
    vetor.append(numero)
for i, n in enumerate(vetor):
    if n > 50:
        print(f"O número {n} está na posição {i}.")
        maior50 = True
if (maior50 == False):
    print("Nenhum dos números é maior que 50.")