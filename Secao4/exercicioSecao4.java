package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSecao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		// soma desses números com uma
		// mensagem explicativa, conforme exemplos.

		Scanner sc = new Scanner(System.in);

		
		int a, b; System.out.println("Entrada: "); a = sc.nextInt(); b =
		sc.nextInt(); System.out.println("Saida: ");
		System.out.printf("Soma = %d \n", a + b);
		
		// --------------------------------------------------------------------------------------//
		
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		//valor da área deste círculo com quatro casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 
		Locale.setDefault(Locale.US); double pi = 3.14159; double raio, area;
		System.out.println("Digite o raio do circulo: "); raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2); System.out.println("O valor da area e: " +
		area);
		
		// --------------------------------------------------------------------------------------//

		
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * 
		 * int a, b, c, d; System.out.
		 * println("Digite 4 valores  e pressione enter após a digitação de cada um");
		 * 
		 * a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); d = sc.nextInt();
		 * 
		 * System.out.println("Diferenca de A*B-C*D = " + (a * b - c * d));
		 * 
		 */
		
		// --------------------------------------------------------------------------------------//

		
		//Fazer um programa que leia o número de um funcionário, seu número de horas
		//trabalhadas, o valor que recebe por hora e calcula o salário desse
		//funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		//casas decimais.
		 
		Locale.setDefault(Locale.US); 
		int numFuncionario, horasTrabalhadas; 
		double salario, valorHora;
		
		System.out.println("Digite os valores seguidos de enter");
		System.out.println("Numero do funcionario: "); 
		
		numFuncionario = sc.nextInt();
		
		System.out.println("Total de horas trabalhadas: "); 
		
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Valor por hora"); 
		
		valorHora = sc.nextDouble(); 
		salario = (double) horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d\nSALARY = US$ %.2f \n", numFuncionario, salario);
		
		// -------------------------------------------------------------------------------------//

		
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		//valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		//o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 
		 
		Locale.setDefault(Locale.US); 
		int codigoPeca1, numPecas1, codigoPeca2, numPecas2; 
		double valUnit1, valUnit2;
		
		System.out.println("Digite o código da peça, quantidade e valor unitario com ponto");
		codigoPeca1 = sc.nextInt(); 
		numPecas1 = sc.nextInt(); 
		valUnit1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça, quantidade e valor unitario com ponto");
		codigoPeca2 = sc.nextInt(); 
		numPecas2 = sc.nextInt(); 
		valUnit2 = sc.nextDouble();
		 
		System.out.println("Valor a pagar: R$ " + (double)(numPecas1 * valUnit1 + numPecas2 * valUnit2));
		
		// -------------------------------------------------------------------------------------//

		
		//Fazer um programa que leia três valores com ponto flutuante de dupla
		//precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		//retângulo que tem A por base e C por altura. b) a área do círculo de raio C *
		//(pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		//e B.
		
		

		double A, B, C, pi = 3.14159;

		System.out.println("Digite 3 valores com 2 casas decimais");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
		System.out.printf("CIRCULO: %.3f\n", (pi * Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: %.3f\n", (A + B) * C / 2);
		System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2));
		System.out.printf("RETANGULO: %.3f\n", (A * B));

	}

}
