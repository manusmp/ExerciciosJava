package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Tabuada");

		System.out.println("Digite um número: ");
		n = sc.nextInt();			
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		sc.close();
	}
	
}
