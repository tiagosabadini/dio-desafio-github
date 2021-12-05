package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor\n");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor\n");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		int subtracao = subtracao(a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Divisao: " + divisao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Subtracao: " + subtracao);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}

}
