vetor1 = []
vetor2 = []
soma = []

for n in range(0,10):
    num1 = int(input("Informe um valor para o primeiro vetor: "))
    vetor1.append(num1)
    num2 = int(input("Informe um valor para o segundo vetor: "))
    vetor2.append(num2)
    soma.append(num1 + num2)
for n in soma:
    print(f"O resultado é: {n}")