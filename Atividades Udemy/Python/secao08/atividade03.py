vetor = []

for n in range(0,10):
    numero = int(input("Informe um valor para o vetor: "))
    vetor.append(numero)

vetor.reverse()
for n in vetor:
    print(n)