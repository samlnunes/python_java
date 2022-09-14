prod1 = int(input('Digite o valor do primeiro produto: '))
prod2 = int(input('Digite o valor do segundo produto: '))
prod3 = int(input('Digite o valor do terceiro produto: '))
prod4 = int(input('Digite o valor do quarto produto: '))
prod5 = int(input('Digite o valor do quinto produto: '))
pago = int(input('Digite o valor pago: '))

troco = pago - (prod1 + prod2 + prod3 + prod4 + prod5)

if (troco < 0):
    print("Você deve R$", troco*-1)
else:
    print("Troco R$", troco)