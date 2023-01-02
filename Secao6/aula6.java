package Secao6;

import java.util.Scanner;

public class aula6 {

	public static void main(String[] args) {
		/*
		 * Estrutura repetitiva "enquanto" • Recomendada quando não se sabe previamente
		 * a quantidade de repetições • Regra: • V: executa e volta • F: pula fora
		 */

		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out
				.println("Digite um valor para x, pressione enter, e um para y que seja maior que x, pressione enter");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x < y) {
			System.out.printf("Falta %d inteiros para chegar em y:\n", y - x);
			x += 1;
		}

		int a, b;

		System.out.println("Digite um valor para a e um para b");
		a = sc.nextInt();
		b = sc.nextInt();

		for (int i = 0; a < b; i++) {
			System.out.println("Valor atual de a: " + a + " de b: " + b + " e de i: " + i);
			a++;
			b--;
		}

		/*
		 * Estrutura repetitiva "faça-enquanto" Menos utilizada, mas em alguns casos se
		 * encaixa melhor ao problema. O bloco de comandos executa pelo menos uma vez,
		 * pois a condição é verificada no final.
		 */
		
		char rept = 's';
		
		do {
			System.out.println("Digite a temperatura em °C");
			double C = sc.nextDouble();
			double F = ((C*9)/5) + 32;
			System.out.println("Equivalente em °F: " + F);
			System.out.println("Deseja repetir (S/N)?");
			rept = sc.next().charAt(0);
		}while(rept != 'n');
				
		sc.close();
	}

}
