package estrutura_repeticao;

import java.util.Scanner;

public class Ex48W {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i = 1;
		
		System.out.printf("Digite um número positivo: ");
	    num = ler.nextInt();

	    while (i <= 21) {
	    	System.out.printf("\n%d", num + i);
	    	i = i + 1;
	   	}
	}
}
