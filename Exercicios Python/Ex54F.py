numeros = []
numerosMult = []

for i in range(0, 20, 1):
    x = int(input('Digite um numero: '))
    numeros.append(x)

const = int(input('Digite o multiplicador: '))

for i in range(0, 20, 1):    
    numerosMult.append(numeros[i] * const)

print(numeros)
print(numerosMult)