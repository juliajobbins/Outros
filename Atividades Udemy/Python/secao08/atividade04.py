vetor = []
soma = 0

for n in range (0,20):
    numero = int(input(f"Informe {n+1}/20 para o vetor: "))
    vetor.append(numero)
    soma += numero

print(f"A soma do vetor é {soma}.")