package estrutura_repeticao;

import java.util.Scanner;

public class Ex49F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicio, fim, i, s = 0;
		
		System.out.printf("Digite o numero inicial: ");
	    inicio = ler.nextInt();
	    
	    System.out.printf("Digite o numero final: ");
	    fim = ler.nextInt();

	    for (i=inicio; i<=fim; i++) {
	    	s = s + i;
	    }
	    
	    System.out.printf("A soma dos numeros no intervalo: %d", s);
	}
}
