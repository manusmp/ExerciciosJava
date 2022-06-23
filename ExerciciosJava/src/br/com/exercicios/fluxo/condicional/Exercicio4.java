package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double tot;
		int qtd;
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Venda de maçãs!!!");

		System.out.println("Digite a quantidade de maçãs: ");
		qtd = sc.nextInt();
		
		if(qtd < 12) {
			tot = qtd * 0.30;
			System.out.printf("Valor total: %.2f ", tot);
		} else {
			tot = qtd * 0.25;
			System.out.printf("Valor total: %.2f ", tot);
		}
		sc.close();
		

	}

}
