package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// divisaoPossivelOuImpossivel
		int n;
		Double numerador;
		Double denominador;
		Double divisao;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextDouble();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextDouble();
			if (denominador == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
				divisao = numerador / denominador;
				System.out.printf("DIVISAO = %.2f%n", divisao);
			}
		}
		sc.close();
	}

}
