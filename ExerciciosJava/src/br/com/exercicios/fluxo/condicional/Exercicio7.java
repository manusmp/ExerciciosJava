package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Double qtd, medida, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de lados: ");
		qtd = sc.nextDouble();
		
		System.out.println("Digite a medida do lado em cm: ");
		medida = sc.nextDouble();
		
		if(qtd == 3) {
			area = (medida * 2)/2;
			System.out.println("Triangulo com area  " + area);
		}
		if(qtd == 4) {
			area = (medida * 2);
			System.out.println("Quadrado com area " + area);
		}
		if(qtd == 5) {
			area = (medida * 2)/2;
			System.out.println("Pentágono com area  " + area);
		}
	
	
	
	}

}
