package estrutura_repeticao;

import java.util.Scanner;

public class Ex50DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicio, fim;
		
		System.out.printf("Digite o numero inicial: ");
	    inicio = ler.nextInt();
	    
	    System.out.printf("Digite o numero final: ");
	    fim = ler.nextInt();
	    
	    do {
	    	if (inicio % 2 == 0 && inicio > 10) {
	    		System.out.printf("\n%d", inicio);
	    	}
	    	
	    	inicio = inicio + 1;
	    } while (fim >= inicio);
	}
}

