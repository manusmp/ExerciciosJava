package br.com.exercicios.simples;

import java.util.Scanner;

public class Exercicio2 {
	
    public static void main(String[] args) {
        int qtdM=0, qtdH=0, sexo;
        float altura, maior=0, menor=10, somaA=0, mediaH=0 ;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++) {      

            System.out.print("Digite 1 para Mulher e 2 para Homem: ");
            sexo = sc.nextInt();
            
            System.out.print("Digite a altura: ");
            altura = sc.nextFloat();        
                      
            if (sexo == 1) {
                qtdM++;
            } else if (sexo == 2) {
                qtdH++;
                somaA = somaA + altura;
            } else {
                System.out.println("Op��o inv�lida!");
            }
            if (altura > maior) {
                 maior = altura;
            } else if (altura < menor) {
            	menor = altura;
           	}
        }
        mediaH = somaA / qtdH;

        System.out.println("A maior altura do grupo � de " + maior + " e a menor � de " + menor);
        System.out.printf("A m�dia de altura dos homens � %.2f\n", mediaH);
        System.out.println("O n�mero de mulheres � " + qtdM);

        sc.close();
    }
}
