inicio = int(input('Digite o número inicial: '))
fim = int(input('Digite o número final: '))

while (fim >= inicio):
    if (inicio % 2 == 0 and inicio > 10):
        print(inicio)
    inicio = inicio + 1