package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite a base do retângulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite a altura do retângulo: ");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		System.out.printf("A área é de %.2f m²", area);
	}

}
