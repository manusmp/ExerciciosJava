package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int n = 0, par = 0, impar = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 n�meros\n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "� n�mero");
			n = sc.nextInt();
			if (n % 2 == 0) {
				par++;
			} else {
				impar++;
			}			
		}
		System.out.println("N�mero de pares " + par);
		System.out.println("N�mero de �mpares " + impar);
		sc.close();
	}

}
