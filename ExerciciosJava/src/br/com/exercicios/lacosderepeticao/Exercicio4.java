package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int idade = 0, tot = 0, adulto = 0, crianca = 0, media = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 idades\n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "� idade");
			idade = sc.nextInt();
			if (idade >= 18) {
				adulto++;
			} else {
				crianca++;
			}
			tot = tot + idade;
			media = tot / 10;
		}
		System.out.println("A m�dia de idades � " + media);
		System.out.println("Crian�as " + crianca);
		System.out.println("Adultos " + adulto);
		if (adulto > crianca) {
			System.out.println("Aqui tem mais adultos!!!");
		} else if (crianca > adulto) {
			System.out.println("Aqui t� cheio de crian�as!!!");
		} else {
			System.out.println("A quantidade de adultos e crian�as � a mesma");
		}

		sc.close();
	}

}
