package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio11{
	
	
	public static void main(String[] args) {
		int anguloA, anguloB, anguloC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que identifica um tri�ngulo");
		
		System.out.println("Digite o primeiro �ngulo: ");
		anguloA = sc.nextInt();	
		
		System.out.println("Digite o segundo �ngulo: ");
		anguloB = sc.nextInt();
		
		System.out.println("Digite o terceiro �ngulo: ");
		anguloC = sc.nextInt();		
		
		if(anguloA == 90 && anguloB == 90 && anguloC == 90) {
			System.out.println("Ret�ngulo!!!");
		} else if(anguloA > 90 && anguloB > 90 && anguloC > 90) {
			System.out.println("Obtus�ngulo!!!");
		}else if(anguloA < 90 && anguloB < 90 && anguloC < 90) {
			System.out.println("Acut�ngulo!!!");
		}
		sc.close();	
	}

}
