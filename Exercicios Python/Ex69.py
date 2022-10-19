matriz = [ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]
matrizAlt = [ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]

for l in range(0, 3, 1):
    for c in range(0, 4, 1):
        matriz[l][c] = int(input('Digite um número: '))

mult = int(input('Digite uma constante multiplicativa: '))

for l in range(0, 3, 1):
    for c in range(0, 4, 1):
        matrizAlt[l][c] = matriz[l][c]*mult

print('Matriz principal')
for i in range(0, 3, 1):
    print(matriz[i])

print('Matriz multiplicativa')
for i in range(0, 3, 1):
    print(matrizAlt[i])