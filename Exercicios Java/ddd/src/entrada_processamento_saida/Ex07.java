package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double prod1, prod2, prod3, prod4, prod5, pago, troco;
		
		System.out.printf("Digite o valor do produto 1: ");
		prod1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produto 2: ");
		prod2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produto 3: ");
		prod3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produto 4: ");
		prod4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produto 5: ");
		prod5 = ler.nextDouble();
		
		System.out.printf("Digite o valor do pago: ");
		pago = ler.nextDouble();
		
		troco = pago - (prod1 + prod2 + prod3 + prod4 + prod5);
		
		if (troco < 0) {			
			System.out.printf("Você está devendo R$%.2f", troco*-1);
		} else {
			System.out.printf("O troco é R$%.2f", troco);
		}
		
	}

}
