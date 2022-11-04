onibus = []

lotacao = 0
resp = 'S'

for i in range(0, 10, 1):
    onibus.append([])

for l in range(0, 10, 1):
    for c in range(0, 4, 1):
        onibus[l].append("-")

print('Excursão Santos (Charlie Brown Jr)')

while resp == 'S' and lotacao != 40:
    print('')
    for i in range(0, len(onibus), 1):
        print(i+1, onibus[i])

    nome = input('\nDigite seu nome: ')
    fil = int(input('Digite a fileira que você deseja: '))-1
    cad = int(input('Digite a cadeira que você deseja: '))-1

    if (onibus[fil][cad] == '-'):
        onibus[fil][cad] = nome
        print('\nReserva realizada com sucesso!')
        lotacao = lotacao + 1
    else:
        print('\nCadeira ocupada!')

    if (lotacao != 40):
        resp = input('\nExiste mais alguém que queira viajar para o litoral (S/N)? ')
    else:
        print('\nÔnibus lotado!')
        break   

print('\nBoa Viagem!\n')

for i in range(0, len(onibus), 1):
    print(i+1, onibus[i])