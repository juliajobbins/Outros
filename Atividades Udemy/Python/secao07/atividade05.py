nome = input("Informe o nome de usuário: ")
senha = input("Informe a senha: ")

while (nome == senha):
    print("O nome de usuário e senha devem ser diferentes.")
    nome = input("Informe o nome de usuário: ")
    senha = input("Informe a senha: ")
    
print("Você acessou o programa!")