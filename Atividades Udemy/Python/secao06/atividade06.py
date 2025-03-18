c = int(input("Informe o código: "))
e = 0
n = int(input("Informe a quantidade de horas trabalhadas: "))

if(n > 50):
    e = n - 50
    n = n - e
    extra = n * 20.00
    salario = n * 10.00
    salariototal = salario + extra
    print(f"Salário: R$ {salario:.2f}")
    print(f"Extra: R$ {extra:.2f}")
    print(f"Salário total: R$ {salariototal:.2f}")
else: 
    salario = n * 10.00
    print(f"Salário: R$ {salario:.2f}")