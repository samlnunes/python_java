inicio = int(input('Digite o número inicial: '))
fim = int(input('Digite o número final: '))

for i in range(inicio, fim + 1, 1):
    if (i % 2 == 0 and i > 10):
        print(i)