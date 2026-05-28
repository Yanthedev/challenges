from datetime import datetime
# Receber as informações.
name = input("Informe seu nome completo: ")
cpf = input("Informe seu CPF: ")
date_birth = input("Informe sua data de nascimento (dd/mm/aa): ")
wage = float(input("Digite seu salário: "))
employee = input("você é funcionário ativo? (s/n)")

if employee == "s":
    status = True
else:
    status = False

# Tratar as Datas
date_birth = datetime.strptime(
    date_birth,
    "%d/%m/%Y"
)
print("=== RELATÓRIO DE CADASTRO ===")
print(f"Nome: {name}", type(name))
print(f"CPF: {cpf}",type(cpf))
print(f"Data de Nascimento: {date_birth.date()}",type(date_birth))
print(f"Salário: R${wage}", type(wage))
print(f"Status: {status}", type(status))
print("=============================")
