package estrutura_repeticao;

import java.util.Scanner;

public class Ex48F {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i;
		
		System.out.printf("Digite um número positivo: ");
	    num = ler.nextInt();
	    
	    for (i=1; i<=21; i++) {	    	
            System.out.printf("\n%d", num + i);
        }
	}
}
