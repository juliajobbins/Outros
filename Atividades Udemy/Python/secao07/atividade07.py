
identificacao = int(input("Informe a identificação: "))
quantidade = 0
esfera = 0
limpeza = 0
trocacabo = 0
quebrado = 0

while (identificacao != 0):
    print("Defeitos:")
    print("1 - Necessita de esfera")
    print("2 - Necessita de limpeza")
    print("3 - Necessita da troca do cabo ou conector")
    print("4 - Quebrado ou inutilizado")
    defeito = int(input("Informe o defeito: "))
    if (defeito == 1):
        esfera += 1
    elif(defeito == 2):
        limpeza += 1
    elif(defeito == 3):
        trocacabo += 1
    elif(defeito == 4):
        quebrado += 1
    quantidade += 1
    identificacao = int(input("Informe a identificação: "))
p1 = esfera / quantidade * 100
p2= limpeza / quantidade * 100
p3 = trocacabo / quantidade * 100
p4 = quebrado / quantidade * 100

print(f"Quantidade de mouses: {quantidade}")
print("Situação   Quantidade   Percentual")
print(f"   1           {esfera}           {p1}")
print(f"   1           {limpeza}           {p2}")
print(f"   1           {trocacabo}           {p3}")
print(f"   1           {quebrado}           {p4}")
