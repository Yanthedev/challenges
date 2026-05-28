while True:
    email = input("Digite o seu email: ").strip()
    
    if ("@" in email and (email.endswith(".com") or email.endswith(".com.br")) and " " not in email):
        print("email válido!")
        break
    else:
        print("email invalido!")
