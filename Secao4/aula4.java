package Secao4;

import java.util.Scanner;
import java.math.*;

public class aula4 {

	public static void main(String[] args) {

		
		//Seção 4 Aula 23
		  
		//Impressão de caracteres na tela sem pular linha
		System.out.print("Impressão sem pular linha - ");
		System.out.print("nao pulou para próxima linha\n");
		  
		//Impressão com quebra de linha
		System.out.println("Imprimiu e quebrou a linha");
		System.out.println("- proxima linha");
		  
		//Declaração de variáveis 
		Locale.setDefault(Locale.US); 
		
		double salario = 1.707; 
		double despesas = 2.044; 
		double renda; 
		String nome = "Name"; 
		int idade = 48;
		int renda = salario / despesas;
		System.out.printf("O funcionario %s tem como salario %.3f , suas despesas sao de %.3f sua idade e de %d anos\n"
		, nome, salario, despesas, idade );
		//Varios elementos concatenados
		
		//---------------------------------------------------------------------------
		
		// Exercícios seção 4 aula 23 /* String product1 = "Computer"; String
		product2 = "Office desktop";
		
		int age = 30; 
		int code = 5290; 
		char gender = 'F';
		double price1 = 2100.0; 
		double price2 = 650.50; 
		double measure = 53.234567;
		System.out.println("Product:");
		System.out.printf("%s, which price is $ %.2f \n%s, which price is $ %.2f",
		product1, price1, product2, price2); System.out.println();
		
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c", age, code,
		gender);
		System.out.println(); 
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimals places) %.3f\n", measure);
		System.out.println("Alter the decimal point with Locale.setDefault");
		
		Locale.setDefault(Locale.US); 
		System.out.printf("US decimal point %.3f", measure);
		
		// ----------------------------------------------------------------------------------------------------//
		
		// Seção 4 aula 24 Casting, saida de dados
		
		int x, y;
		x = 5;
		y = x * 2;
		System.out.println(x);
		System.out.println(y);

		int a;
		double z;
		a = 5;
		z = 2 * a;
		System.out.println(a);
		System.out.println(z);

		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;
		System.out.println(area);

		int val1 = 5, val2 = 2;
		double resultado;

		resultado = val1 / val2;
		System.out.println("Sem utilizar cast int armazenado em double");
		System.out.println(resultado);

		System.out.println("Utilizando cast");
		resultado = (double) val1 / val2;
		System.out.println(resultado);

		// Seção 4 aula 25 e 26 entrada de dados

		Scanner sc = new Scanner(System.in);

		String palavra;
		System.out.print("Digite uma palavra e pressione enter: ");
		palavra = sc.next();
		System.out.printf("A palavra digitada foi: %s\n", palavra);
		int valor;
		System.out.print("Digite um numero: ");
		valor = sc.nextInt();
		System.out.printf("O numero digitado foi : %d\n", valor);
		double result;
		System.out.print("Digite um numero com casa decimal: ");
		result = sc.nextDouble();
		System.out.printf("O numero digitado foi: %.3f\n", result);
		char carac;
		System.out.println("Digite um caracter: ");
		carac = sc.next().charAt(0);
		System.out.printf("Caracter digitado: %c", carac);

		// Ler varios dados na mesma linha após o espaço
		String word;
		int val3;
		double val4;

		System.out.println("Digite uma palavra, um numero inteiro e um numero com virgula");
		word = sc.next();
		val3 = sc.nextInt();
		val4 = sc.nextDouble();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(word);
		System.out.println(val3);
		System.out.println(val4);
		sc.nextLine();//É preciso consumir o enter antes de receber novos valores
		
		//Ler uma cadeia de caracteres com espaço antes do enter
		
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
		
		// Seção 4 aula 27 Funções matemáticas
		
		double y, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para base: ");
		y = sc.nextDouble();
		System.out.println("Digite um valor para potencia: ");
		x = sc.nextDouble();
		System.out.println(Math.pow(3, 2));
		System.out.printf("O valor de a: %.1f elevado a %.1f = %.2f\n", y,x,Math.pow(y, x));
		
		//Calcular equação 2º grau
		double x1, x2, a, b, c, delta;
		a = 3.0;
		b = 8.0;
		c = 5;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta) / 2 * a);
		x2 = (b + Math.sqrt(delta) / 2 * a);
		System.out.printf("Valor de x1: %.2f valor de x2: %.2f",x1, x2);
			
	}

}
