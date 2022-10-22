onibus = [['','','',''], ['','','',''], ['','','',''], ['','','',''], ['','','',''], ['','','',''], ['','','',''], ['','','',''], ['','','',''], ['','','','']]

vagas = True
resp = 'S'

print('Excursão Las Vega')

while vagas and resp == 'S':
    print('')
    for i in range(0, len(onibus), 1):
        print(i+1, onibus[i])

    nome = input('\nDigite seu nome: ')
    fil = int(input('Digite a fileira que você deseja: '))-1
    cad = int(input('Digite a cadeira que você deseja: '))-1

    if (onibus[fil][cad] == ''):
        onibus[fil][cad] = nome
    else:
        print('Cadeira ocupada\n')
    
    vagas = False
    for l in range(0, len(onibus), 1):
        for c in range(0, 4, 1):
            if (onibus[l][c] == ''):
                vagas = True

    resp = input('\nExiste mais alguém que queira viajar para a metrópole (S/N)? ')

if (vagas == False):
    print('\nÔnibus lotado!')

print('\nBoa Viagem!')
for i in range(0, len(onibus), 1):
    print(i+1, onibus[i])