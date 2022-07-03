package br.com.exercicios.vetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] n = new int[10];
		int[] v = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			n[i] = sc.nextInt();
			v[i] = n[i] * 5;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(n[i]);
		}

		System.out.println("\n");

		for (int i = 0; i < 10; i++) {
			System.out.println(v[i]);
		}

		sc.close();
	}
}
