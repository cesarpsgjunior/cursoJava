package Secao5;

import java.util.Locale;
import java.util.Scanner;

public class aula5 {

	public static void main(String[] args) {
		// Estruturas condicionais IF
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * int valor;
		 * 
		 * 
		 * System.out.println("Digite um valor entre 0 e 24: "); valor = sc.nextInt();
		 * if (valor <= 12) { System.out.println("Bom dia"); } else if (valor <= 18) {
		 * System.out.println("Boa tarde"); } else { System.out.println("Boa noite"); }
		 * 
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 * 
		 * 
		 * int minutos; System.out.println("Quantos minutos foram gastos?"); minutos =
		 * sc.nextInt(); if (minutos > 100) {
		 * System.out.println("Valor da mensalidade R$ " + (50 + (minutos - 100) * 2));
		 * } else { System.out.println("Valor da mensalidade R$ 50,00"); }
		 */
		// Estruturas condicionais Swift Case

		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos.
		 * 
		 * 
		 * int diaDaSemana; System.out.println("Digite um numero de 1 a 7"); diaDaSemana
		 * = sc.nextInt(); String dia; 
		 * switch (diaDaSemana) { 
		 * case 1: 
		 * dia = "domingo";
		 * break; case 2: dia = "segunda"; break; case 3: dia = "terça"; break; case 4:
		 * dia = "quarta"; break; case 5: dia = "quinta"; break; case 6: dia = "sexta";
		 * break; case 7: dia = "sabado"; break; default: dia = "valor invalido"; break;
		 * } if(diaDaSemana > 7) { System.out.println(dia); }else {
		 * System.out.printf("Voce digitou o valor %d que corresponde ao dia %s",
		 * diaDaSemana, dia); }
		 */
		
		
		
		

		// Estruturas condicionais ternária modo simplificado IF
		// ( condição ) ? valor_se_verdadeiro : valor_se_falso
		/*
		 * int x = 1, y = 2; String result = (x > y) ? "Maior" : "Menor";
		 * System.out.println(result);
		 */
		
		
		//Escopo de variáveis
		/*
		 * Variáveis criadas e iniciadas dentro de estruturas tem seu escopo limitado a estrutura onde foram criadas
		 * 
		 */
		
		int x = 8;
		if(x > 4) {
			String valor = "Maior que 8";
			System.out.println(valor); //Aqui seria possível imprimir a variável
		}
		//System.out.println(valor); //Aqui não seria possível imprimir a variável\\
		
		
		sc.close();
	}
}