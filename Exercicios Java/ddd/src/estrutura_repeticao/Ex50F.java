package estrutura_repeticao;

import java.util.Scanner;

public class Ex50F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicio, fim, i;
		
		System.out.printf("Digite o numero inicial: ");
	    inicio = ler.nextInt();
	    
	    System.out.printf("Digite o numero final: ");
	    fim = ler.nextInt();

	    for (i=inicio; i<=fim; i++) {
	    	if (i % 2 == 0 && i > 10) {
	    		System.out.printf("\n%d", i);
	    	}
	    }    
	}
}
