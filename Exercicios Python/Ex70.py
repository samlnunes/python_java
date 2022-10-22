matriz = []

lin = 0
col = 0

while (lin > 10 or lin < 1):
    lin = int(input('Digite a quantidade de linhas (Max. 10): '))

while (col > 10 or col < 1):
    col = int(input('Digite a quantidade de colunas (Max. 10): '))

for l in range(0, lin, 1):
    matriz.append([])

for l in range(0, lin, 1):
    for c in range(0, col, 1):
        matriz[l].append(int(input('Digite um número: ')))

print('Matriz')
for i in range(0, lin, 1):
    print(matriz[i])

proc =  int(input('Digite a número que deseja procurar: '))
contador = 0
for l in range(0, lin, 1):
     for c in range(0, col, 1):
        if (matriz[l][c] == proc):
            contador += 1
            print('Linha: ', l+1, ' Coluna: ', c+1)

if (contador == 0):
    print('Número não encontrado')