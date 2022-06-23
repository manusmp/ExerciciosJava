package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio11{
	
	
	public static void main(String[] args) {
		int anguloA, anguloB, anguloC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que identifica um triângulo");
		
		System.out.println("Digite o primeiro ângulo: ");
		anguloA = sc.nextInt();	
		
		System.out.println("Digite o segundo ângulo: ");
		anguloB = sc.nextInt();
		
		System.out.println("Digite o terceiro ângulo: ");
		anguloC = sc.nextInt();		
		
		if(anguloA == 90 && anguloB == 90 && anguloC == 90) {
			System.out.println("Retângulo!!!");
		} else if(anguloA > 90 && anguloB > 90 && anguloC > 90) {
			System.out.println("Obtusângulo!!!");
		}else if(anguloA < 90 && anguloB < 90 && anguloC < 90) {
			System.out.println("Acutângulo!!!");
		}
		sc.close();	
	}

}
