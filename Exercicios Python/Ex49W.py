inicio = int(input('Digite o número inicial: '))
fim = int(input('Digite o número final: '))
s = 0

while (fim >= inicio):
    s = s + fim
    fim = fim - 1

print('A soma dos números no intervalo é', s)