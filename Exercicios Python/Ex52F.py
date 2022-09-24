numeros = []
maior = 0

for i in range(0, 10, 1):
    x = int(input('Digite um numero: '))
    numeros.append(x)
    if (x > maior):
        maior = x

print('O maior numero é:', maior)