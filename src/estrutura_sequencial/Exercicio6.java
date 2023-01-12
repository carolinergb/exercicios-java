package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double pi = 3.14159;
		double triangulo = a * c / 2;
		double circulo = c * c * pi;
		double trapezio = (a + b) / 2 * c;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
		
		sc.close();

	}

}
