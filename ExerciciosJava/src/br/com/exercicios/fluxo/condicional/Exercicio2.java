package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double anoN, anoA;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ser� que voc� pode votar?");

		
		System.out.println("Digite o ano que nasceu: ");
		anoN = sc.nextDouble();
		
		System.out.println("Digite o ano atual: ");
		anoA = sc.nextDouble();
		
		if (anoA - anoN >= 18) {
			System.out.println("Voc� pode votar!");
		}else {
			System.out.println("Esse ano n�o pode!");
		}
		sc.close();
	}

}
