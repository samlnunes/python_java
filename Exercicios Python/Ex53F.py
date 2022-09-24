numeros = []

for i in range(0, 20, 1):
    x = int(input('Digite um numero: '))
    numeros.append(x)

const = int(input('Digite o multiplicador: '))

for i in range(0, 20, 1):    
    numeros[i] = numeros[i] * const

print(numeros)