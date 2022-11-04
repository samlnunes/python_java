package Ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Conta> listaContas = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.printf("\n\n === Menu ===\n\n");
			System.out.printf("1 - Conta Corrente \n" +
								"2 - Conta Poupança \n" +
								"3 - Conta Salário \n" +								
								"4 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();	
			
			if(opcao == 1) {
				ContaCorrente conta = new ContaCorrente();
				
				System.out.printf("\nDigite a agência da conta: ");
				conta.setAgencia(ler.next());
				
				System.out.printf("\nDigite o número da conta: ");
				conta.setNumero(ler.next());
				
				listaContas.add(conta);
		               
                System.out.printf("Conta incluída com sucesso!");
                System.in.read();
                
			} else if (opcao == 2) {
				ContaPoupanca conta = new ContaPoupanca();
				
				System.out.printf("\nDigite a agência da conta: ");
				conta.setAgencia(ler.next());
				
				System.out.printf("\nDigite o número da conta: ");
				conta.setNumero(ler.next());
				
				System.out.printf("\nDigite a rentabilidade da conta: ");
				conta.setRentabilidade(ler.nextDouble());
				
				listaContas.add(conta);
		               
                System.out.printf("Conta incluída com sucesso!");
                System.in.read();
                
			} else if (opcao == 3) {
				ContaSalario conta = new ContaSalario();
				
				System.out.printf("\nDigite a agência da conta: ");
				conta.setAgencia(ler.next());
				
				System.out.printf("\nDigite o número da conta: ");
				conta.setNumero(ler.next());
				
				System.out.printf("\nDigite o CNPJ da empresa: ");
				conta.setCnpj(ler.next());
				
				listaContas.add(conta);
		               
                System.out.printf("Conta incluída com sucesso!");
                System.in.read();
			}
		} while((opcao >= 1) && (opcao <= 3));	
	}
}
