package br.com.exercicios.extra;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, chute = 0, qtdChutes = 0;

		System.out.print("Informe o n�mero: ");
		numero = sc.nextInt();

		while (chute != numero) {
			System.out.print("Tente adivinhar o n�mero: ");
			chute = sc.nextInt();
			qtdChutes++;

			if (chute == numero) {
				System.out.println("Acertou!");
				System.out.println("Parab�ns, precisou de " + qtdChutes + " chutes pra acertar");
			} else if (chute < numero) {
				System.out.println("Chutou baixo");
			} else if (chute > numero) {
				System.out.println("Chutou alto");

			}

		}
		sc.close();

	}
}
