package br.com.exercicios.vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] v = new int[5];
		Integer soma = 0, valor;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			valor = sc.nextInt();
			soma = soma + valor;
			v[i] = valor;
		}

		System.out.println("Soma: " + soma);
		for (int i : v) {
			System.out.println(i);
		}

		sc.close();
	}
}
