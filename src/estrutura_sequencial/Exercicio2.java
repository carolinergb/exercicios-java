package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raioCirculo = sc.nextDouble();
		double area = pi * (raioCirculo * raioCirculo);
		
		System.out.printf("Valor da área do circulo = %.4f", area);
		
		sc.close();

	}

}
