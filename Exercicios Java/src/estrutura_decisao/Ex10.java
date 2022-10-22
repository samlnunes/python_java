package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.printf("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		if (valor1 > valor2) {
			System.out.printf("O maior valor é %d", valor1);
		} else if (valor2 > valor1) {
			System.out.printf("O maior valor é %d", valor2);
		} else {
			System.out.printf("Os valores são iguais!");
		}
	}
}