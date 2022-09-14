peso = int(input('Digite seu peso: '))
altura = int(input('Digite sua altura: '))

imc = peso / (altura * altura)
 
if imc < 20:
    print("Abaixo do peso!")
elif imc < 25:
    print("Peso ideal!")
else:
    print("Acima do peso!")