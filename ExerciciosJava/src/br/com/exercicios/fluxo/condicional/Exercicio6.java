package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double sexo, altura, peso;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1-para mulher e 2-para homem: ");
		sexo = sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		
		if(sexo == 1) {
			peso = (62.1 * altura) - 44.7;
			System.out.printf("O peso ideal é: %.2f", peso);
		} else {
			peso = (72.7 * altura) - 58;
			System.out.printf("O peso ideal é: %.2f", peso);

		}
		sc.close();		

	}
	
}
