num1 = int(input('Digite o primero valor: '))
num2 = int(input('Digite o segundo valor: '))
num3 = int(input('Digite o terceiro valor: '))


if (num1 != num2 and num1 != num3):
    print("Forma triângulo escaleno")
elif (num1 == num2 and num2 == num3):
    print("Forma triângulo equilátero")
elif (num1 == num2 or num1 == num3 or num2 == num3):
    print("Forma triângulo isósceles")   
