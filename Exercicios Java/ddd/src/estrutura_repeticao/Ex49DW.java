package estrutura_repeticao;

import java.util.Scanner;

public class Ex49DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicio, fim, s = 0;
		
		System.out.printf("Digite o numero inicial: ");
	    inicio = ler.nextInt();
	    
	    System.out.printf("Digite o numero final: ");
	    fim = ler.nextInt();
	    
	    do {
	    	s = s + fim;
	    	fim = fim - 1;
	    } while (fim >= inicio);
	    
	    System.out.printf("A soma dos numeros no intervalo: %d", s);
	}
}
