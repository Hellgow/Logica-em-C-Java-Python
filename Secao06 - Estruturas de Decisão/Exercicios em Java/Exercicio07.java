package br.com.udemy.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, num4, q1, q2, q3, q4;
		
		System.out.print("Informe 1� numero inteiro: ");
		num1 = teclado.nextInt();
		System.out.print("Informe 2� numero inteiro: ");
		num2 = teclado.nextInt();
		System.out.print("Informe 3� numero inteiro: ");
		num3 = teclado.nextInt();
		System.out.print("Informe 4� numero inteiro: ");
		num4 = teclado.nextInt();
		
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;
		
		if(q3 >= 1000) {
			System.out.println("O quadrado do Terceiro Numero �: " + q3);
		}else{
			System.out.println(+ num1 + " - " + q1);
			System.out.println(+ num2 + " - " + q2);
			System.out.println(+ num3 + " - " + q3);
			System.out.println(+ num4 + " - " + q4);
			
		}
		
		teclado.close();

	}

}
