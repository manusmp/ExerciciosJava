package br.com.exercicios.vetores;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		int[] v = new int[10];
		int numero;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um n?mero: ");
			numero = sc.nextInt();

			while (numero == 0) {
				System.out.println("Diferente de 0!");
				numero = sc.nextInt();
			}

			if (numero % 2 == 0) {
				n[i] = numero;
				
			} else {
				v[i] = numero;
			}
		}

		System.out.println("PARES");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		System.out.println("IMPARES");
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}

	}
}
