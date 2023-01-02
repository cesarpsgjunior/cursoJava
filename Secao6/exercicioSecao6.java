package Secao6;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSecao6 {

	public static void main(String[] args) {
		// Exercicios seção 6
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002
		 * 
		 * 
		 *
		 * 
		 * 
		 * int senha = sc.nextInt();
		 * 
		 * while(senha != 2022) { System.out.println("senha invalida"); senha =
		 * sc.nextInt();
		 * 
		 * } System.out.println("Senha correta, acesso liberado");
		 * 
		 */

		// -------------------------------------------------------------------------------------//

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 * 
		 * double x, y;
		 * 
		 * x = sc.nextDouble(); y = sc.nextDouble();
		 * 
		 * while (x != 0.0 || y != 0.0) { x = sc.nextDouble(); y = sc.nextDouble(); if
		 * (x == 0.0 || y == 0.0) { System.out.println(""); } else if (x >= 0.0 && y >=
		 * 0.0) { System.out.println("Quadrante 1"); } else if (x >= 0.0 && y <= 0.0) {
		 * System.out.println("Quadrante 2"); } else if (x <= 0.0 && y <= 0.0) {
		 * System.out.println("Quadrante 3"); } else if (x <= 0.0 && y >= 0) {
		 * System.out.println("Quadrante 4"); } }
		 */

		// ----------------------------------------------------------------------------------------//

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		int gasolina = 0, alcool = 0, diesel = 0, val;

		do {
			System.out.println("Qual a preferencia de combustível, 1 , 2 , 3?");
			val = sc.nextInt();
			if (val == 1) {
				gasolina++;
			} else if (val == 2) {
				alcool++;
			} else if (val == 3) {
				diesel++;
			} else if (val < 1 || val > 4) {
				System.out.println("Codigo invalido, digite novo código");
			}

		} while (val != 4);
		
		System.out.println("Muito obrigado!!!");
		System.out.println("Gasolina:" + gasolina);
		System.out.println("Alcool:" + alcool);
		System.out.println("Diesel:" + diesel);
		sc.close();
	}

}
