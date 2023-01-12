package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.printf("Número do funcionário: %d%nSalário = R$ %.2f", funcionario, salario);
		
		sc.close();

	}

}
