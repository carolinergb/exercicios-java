package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio do jogo:");
		int horaInicio = sc.nextInt();
		
		System.out.println("Digite a hora do final do jogo:");
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		sc.close();
	}

}
