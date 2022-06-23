package br.com.exercicios.simples;

import java.util.Scanner;

public class Exercicio4 {

	  public static void main(String[] args) {
	        double hp, lp, la, ha, qtd;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite a altura da parede: ");
	        hp = sc.nextDouble();
	        
	        System.out.println("Digite a largura da parede: ");
	        lp = sc.nextDouble();
	        
	        System.out.println("Digite a altura do azulejo: ");
	        ha = sc.nextDouble();
	        
	        System.out.println("Digite a largura do azulejo: ");
	        la = sc.nextDouble();
	        
	        
	        qtd = (hp * lp) / (ha * la);
	  
	        System.out.printf("Quantidade de azulejos necessários para cobrir a parede: %.2f" , qtd);   
	        
	        sc.close();
}
	  
	  
}