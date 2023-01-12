package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigoPeca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		double totalPeca1 = numeroPeca1 * valorPeca1;
		
		int codigoPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		double totalPeca2 = numeroPeca2 * valorPeca2;
		
		double total = totalPeca1 + totalPeca2;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		sc.close();
	}

}
