inicio = int(input('Digite o número inicial: '))
fim = int(input('Digite o número final: '))
s = 0

for i in range(inicio, fim + 1, 1):
    s = s + i

print('A soma dos números no intervalo é', s)