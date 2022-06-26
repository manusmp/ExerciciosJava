package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Digite um numéro entre 12 e 20");
			n = sc.nextInt();

			if (n < 12 || n > 20) {
				System.err.println("Número inválido, digite novamente");
			}
			System.out.println("O número digitado foi: " + n);

		} while (n > 20 || n < 12);

		sc.close();
	}
}
