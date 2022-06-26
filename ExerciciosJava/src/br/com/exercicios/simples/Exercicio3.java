package br.com.exercicios.simples;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		double func, salario = 0, media, totSalario = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Média salarial");

		System.out.print("Digite a quantidade de funcionarios: ");
		func = sc.nextInt();

		for (int i = 0; i < func; i++) {

			System.out.print("Digite o salário: ");
			salario = sc.nextInt();

			totSalario = totSalario + salario;
		}

		media = totSalario / func;

		System.out.printf("A média salarial da empresa é de R$ %.2f", media);
		sc.close();
	}
}