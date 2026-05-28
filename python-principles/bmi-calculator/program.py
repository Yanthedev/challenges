# Calculadora de IMC

weight = float(input("Digite seu peso em Kg: "))
height = float(input("Digite sua altura em metros: "))

calculator = weight/(height**2)

print(f"Seu IMC é: {calculator:.2f}")