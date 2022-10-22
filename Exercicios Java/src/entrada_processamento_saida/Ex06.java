package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cot, dolar, real;
		
		System.out.printf("Digite a cotação do dólar: ");
		cot = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de dólares: ");
		dolar = ler.nextDouble();
		
		real = cot * dolar;
		
		System.out.printf("Você possui R$%.2f", real);
	}

}
