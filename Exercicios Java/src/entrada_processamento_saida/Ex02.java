package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double aresta, area;
		
		System.out.printf("Digite a aresta do quadrado: ");
		aresta = ler.nextDouble();
		
		area = aresta * aresta;
		
		System.out.printf("A área é de %.2f m²", area);
	}

}
