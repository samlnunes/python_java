package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius, fah;
		
		System.out.printf("Digite a temperatura em graus Celsius: ");
		celsius = ler.nextDouble();
		
		fah = (celsius * 9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é: %.1f ºF", fah);
	}

}
