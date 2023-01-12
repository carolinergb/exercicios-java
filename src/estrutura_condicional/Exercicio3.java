package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Os números são múltiplos");
		}
		else {
			System.out.println("Os números não são múltiplos");
		}
		
		sc.close();
	}

}
