package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual valor é maior?");

		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextDouble();

		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextDouble();

		if (n1 > n2) {
			System.out.println("Maior valor: " + n1);
		} else {
			System.out.println("Maior valor: " + n2);
		}
		sc.close();

	}
}
