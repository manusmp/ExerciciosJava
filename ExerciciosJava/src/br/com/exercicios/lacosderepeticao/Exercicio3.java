package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Tabuada");

		while (n < 1 || n > 10) {
			System.out.println("Digite um valor de 1 a 10");
			n = sc.nextInt();
			
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		sc.close();
	}
	
}
