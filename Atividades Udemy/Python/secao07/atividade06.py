numero = int(input("Informe um número entre 1 e 10: "))

while (numero > 10 or numero < 1):
    print("O número deve estar entre 1 e 10.")
    numero = int(input("Informe um número entre 1 e 10: "))

print(f"----- Tabuada do {numero}: -----")

for num in range(1,11):
    print(f"{numero} X {num} = {numero * num}")