manhã = []
tarde = []
noite = []

lotacaoM = 0
lotacaoT = 0
lotacaoN = 0
resp = 'S'

print('Show do Charlie Brown\n')
fileiras = int(input('Digite a quantidade de fileiras: '))
cadeiras = int(input('Digite a quantidade de cadeiras: '))

lotacaoMax = fileiras * cadeiras

for i in range(0, fileiras, 1):
    manhã.append([])
    tarde.append([])
    noite.append([])

for l in range(0, fileiras, 1):
    for c in range(0, cadeiras, 1):
        manhã[l].append("-")
        tarde[l].append("-")
        noite[l].append("-")

while resp == 'S':
    nome = input('\nDigite seu nome: ')
    section = input('\nDigite sua sessão (M, T, N): ')
    fil = int(input('Digite a fileira que você deseja: '))-1
    cad = int(input('Digite a cadeira que você deseja: '))-1

    while (section[fil][cad] != '-'):
        print('\nCadeira ocupada!')
        fil = int(input('Digite a fileira que você deseja: '))-1
        cad = int(input('Digite a cadeira que você deseja: '))-1

    section[fil][cad] = nome
    print('\nReserva realizada com sucesso!')

    if section == 'M':
        lotacaoM = lotacaoM + 1
        if (lotacaoM != lotacaoMax - (lotacaoMax * 0.8)):
            resp = input('\nExiste mais alguém que queira comprar ingresso? (S/N)? ')
        else:
            print('\nÔnibus lotado!')
        break   
    elif section == 'T':
        lotacaoT = lotacaoT + 1
        if (lotacaoT != lotacaoMax - (lotacaoMax * 0.8)):
            resp = input('\nExiste mais alguém que queira comprar ingresso? (S/N)? ')
        else:
            print('\nÔnibus lotado!')
        break   
    elif section == 'N':
        lotacaoN = lotacaoN + 1
        if (lotacaoN != lotacaoMax - (lotacaoMax * 0.8)):
            resp = input('\nExiste mais alguém que queira comprar ingresso? (S/N)? ')
        else:
            print('\nÔnibus lotado!')
        break      

print('\nBoa Viagem!\n')