package Secao5;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSecao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 * 
		 * 
		 * 
		 * int x; System.out.println("Digite um numero: "); //Testando com if x =
		 * sc.nextInt(); if(x >= 0) { System.out.println("NAO NEGATIVO"); }else {
		 * System.out.println("NEGATIVO"); }
		 */

		// ---------------------------------------------------------------------------------//
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 * 
		 * int dividendo, divisor = 2, restoDiv;
		 * 
		 * System.out.println("Digite um numero: "); dividendo = sc.nextInt(); restoDiv
		 * = dividendo % divisor; if (restoDiv == 0) { System.out.println("Par"); } else
		 * { System.out.println("Impar"); }
		 * 
		 * String result; result = (restoDiv == 0) ? "Par" : "Impar";
		 * System.out.println(result);
		 */

		// ----------------------------------------------------------------------------------------//

		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 * 
		 * 
		 * int A, B, result; System.out.println("Digite um numero inteiro:"); A =
		 * sc.nextInt(); System.out.println("Digite outro numero inteiro"); B =
		 * sc.nextInt(); if(A >= B) { result = A % B; if(result == 0) {
		 * System.out.println("Sao multiplos"); }else {
		 * System.out.println("Nao sao multiplos"); } }else { result = B % A; if(result
		 * == 0) { System.out.println("Sao multiplos"); }else {
		 * System.out.println("Não são multiplos"); } }
		 */

		// ---------------------------------------------------------------------------------------------//

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 * 
		 * int horaInicio, horaFim, diaInicio, diaFim, duracaoJogo, difDia, difHora;
		 * System.out.println("Digite o dia de inicio do jogo"); diaInicio =
		 * sc.nextInt(); System.out.println("Digite o dia fim do jogo"); diaFim =
		 * sc.nextInt(); System.out.println("Digite a hora de inicio do jogo");
		 * horaInicio = sc.nextInt();
		 * System.out.println("Digite a hora do fim do jogo"); horaFim = sc.nextInt();
		 * difDia = diaFim - diaInicio; difHora = (24 - horaInicio) + horaFim;
		 * if(diaInicio > diaFim || (diaFim - diaInicio) > 1 ) { System.out.
		 * println("Jogo nao pode comecar antes do fim ou ter mais de um dia de duracao"
		 * ); }else { if(difDia == 1 && difHora > 24){ duracaoJogo = 24; }else {
		 * duracaoJogo = (24 - horaInicio) + horaFim; }
		 * System.out.println("O jogo comecou dia " + diaInicio + " as : " + horaInicio
		 * + " e terminou as: " + horaFim + " do dia " + diaFim);
		 * System.out.println("Duração do jogo:" + duracaoJogo); }
		 */

		// ----------------------------------------------------------------------------------------------------//

		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * Codigo Especificação Preço 1 Hot Dog R$ 4,00 2 x-salada R$ 4,50 3 x-Bacon R$
		 * 5,00 4 Torrada R$ 2,00 5 Refrigerante R$ 1,50
		 * 
		 * int codigo, qty; double preco;
		 * 
		 * System.out.println("Digite o codigo do produto"); codigo = sc.nextInt();
		 * System.out.println("Digite a quantidade do produto"); qty = sc.nextInt();
		 * System.out.println("Digite o preco do produto"); preco = sc.nextDouble();
		 * 
		 * switch (codigo) { case 1: System.out.println("Valor total: R$" + (double) qty
		 * * preco); break; case 2: System.out.println("Valor total: R$" + (double) qty
		 * * preco); break; case 3: System.out.println("Valor total: R$" + (double) qty
		 * * preco); break; case 4: System.out.println("Valor total: R$" + (double) qty
		 * * preco); break; case 5: System.out.println("Valor total: R$" + (double) (qty
		 * * preco)); break; }
		 */

		// ---------------------------------------------------------------------------------------------------------//

		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 * 
		 * 
		 * int val; System.out.println("Digite um numero de 0 a 100"); val =
		 * sc.nextInt(); if (val <= 25) {
		 * System.out.println("Valor esta no intervalo de 0 a 25"); } else if (val <=
		 * 50) { System.out.println("Valor esta no intervalo de 25 a 50");
		 * 
		 * } else if (val <= 75) {
		 * System.out.println("Valor esta no intervalo de 50 a 75"); } else if (val <=
		 * 100) { System.out.println("Valor esta no intervalo de 75 a 100"); } else {
		 * System.out.println("Fora do intervalo"); }
		 */

		// -------------------------------------------------------------------------------------------------------------//

		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
		 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 * 
		 * 
		 * double x, y;
		 * 
		 * System.out.println("Digite dois valores com uma casa decimal: "); x =
		 * sc.nextDouble(); y = sc.nextDouble();
		 * 
		 * if(x == 0.0 && y == 0.0) { System.out.println("Origem"); }else if(x >= 0.0 &&
		 * y >= 0.0){ System.out.println("Quadrante 1"); }else if(x >= 0.0 && y <= 0.0)
		 * { System.out.println("Quadrante 2"); }else if(x <= 0.0 && y <= 0.0) {
		 * System.out.println("Quadrante 3"); }else if(x <= 0.0 && y >=0) {
		 * System.out.println("Quadrante 4"); }
		 */

		// ----------------------------------------------------------------------------------------------------------------//

		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com
		 * duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em
		 * seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
		 * Renda, segundo a tabela abaixo. Lembre que, se o salário for R$ 3002.00, a
		 * taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que
		 * fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo
		 * fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o
		 * que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas
		 * decimais.
		 */

		double salario, faixa1 = 0.08, faixa2 = 0.18, faixa3 = 0.28, irFaixa1, irFaixa2, irFaixa3,
				tetoIsentoFaixa1 = 2000.00, tetoIsentoFaixa2 = 3000.00, tetoIsentoFaixa3 = 4500.00;

		System.out.println("Qual seu salario? ");
		salario = sc.nextDouble();
		irFaixa1 = (1000.00 * faixa1);
		irFaixa2 = (1500.00 * faixa2);
		irFaixa3 = (salario - 4500.00) * faixa3;

		if (salario <= tetoIsentoFaixa1) {
			System.out.println("Isento de IR");
		} else if (salario <= tetoIsentoFaixa2) {
			System.out.printf("imposto a pagar: %.3f\n", (salario - tetoIsentoFaixa1) * faixa1);
		} else if (salario > tetoIsentoFaixa2 && salario <= tetoIsentoFaixa3) {
			System.out.printf("Imposto a pagar: %.2f\n", ((irFaixa1) + (salario - tetoIsentoFaixa2) * faixa2));
		} else if (salario > tetoIsentoFaixa3) {
			System.out.printf("Imposto a a pagar: %.2f\n", irFaixa1 + irFaixa2 + irFaixa3);
		}
		sc.close();
	}

}
