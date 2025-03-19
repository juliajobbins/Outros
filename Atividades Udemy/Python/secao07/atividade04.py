maior = -999
menor = 999
soma = 0

for numero in range(1,11):
    valor = int(input("Informe um número: "))
    if (valor > 0):
        maior = valor
    if (valor < menor):
        menor = valor
    soma += valor
else:
    valor = int(input("Informe um valor: "))
media = soma /10

print(f"O maior número é {maior}.")
print(f"O menor número é {menor}.")
print(f"A média dos números é {media}")