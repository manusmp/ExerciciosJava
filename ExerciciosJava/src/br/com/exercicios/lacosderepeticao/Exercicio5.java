package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int n = 0, par = 0, impar = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 números\n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "º número");
			n = sc.nextInt();
			if (n % 2 == 0) {
				par++;
			} else {
				impar++;
			}			
		}
		System.out.println("Número de pares " + par);
		System.out.println("Número de ímpares " + impar);
		sc.close();
	}

}
