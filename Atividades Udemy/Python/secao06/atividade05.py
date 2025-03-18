e = 0
m = 0
peso = float(input("Informe o peso dos peixes: "))

if (peso > 50):
    e = (peso - 50)
    m = e * 4
    print(f"Peso: {peso:.2f} kg")
    print(f"Excesso: {e:.2f} kg")
    print(f"Multa: R$ {m:.2f}")
else:
    print("Sem excesso.")