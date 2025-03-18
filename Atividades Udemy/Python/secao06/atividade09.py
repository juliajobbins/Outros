indice = float(input("Informe o índice de poluição: "))

if(indice >= 0.3 and indice < 0.4):
    print("As indústrias do 1º grupo devem suspender as atividades.")
elif(indice >= 0.4 and indice < 0.5):
    print("As indústrias do 1º e 2º grupo devem suspender as atividades.")
elif(indice >= 0.5):
    print("ALERTA: As indústrias de todos os grupos devem suspender as atividades.")
else:
    print("Índice de poluição aceitável.")