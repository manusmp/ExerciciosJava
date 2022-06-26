package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double n1, n2, n3, media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		n2 = sc.nextDouble();

		System.out.println("Digite a terceira nota: ");
		n3 = sc.nextDouble();

		media = (n1 + n2 + n3) / 3;

		if (media < 6) {
			System.out.printf("Media: %.2f", media);
			System.err.println("\nReprovado!");
		} else {
			System.out.printf("Media: %.2f", media);
			System.out.println("\nAprovado!");
		}
		sc.close();

	}

}
