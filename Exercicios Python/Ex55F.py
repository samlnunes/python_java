numeros = []
x = 0

qtd = int(input('Quantos valores serão armazenados? (Max. 20): '))

while qtd > 20:
    qtd = int(input('Quantos valores serão armazenados? (Max. 20): '))

for i in range(0, qtd, 1):
    x = int(input('Digite um numero: '))
    numeros.append(x)

proc = int(input('Qual número você procura? '))

if (numeros.index(proc)):
    print('O número está na posição:', numeros.index(proc))
else:
    print('Valor não encontrado!')
    