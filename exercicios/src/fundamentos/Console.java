package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f %n %n", 1234.5678);
		System.out.printf("Nome: %s%n%n", "João");
		
		String nome, sobrenome;
		int idade;
		System.out.print("Informe seu nome: ");
		nome = scan.nextLine();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = scan.nextLine();
		System.out.print("Informe sua idade: ");
		idade = scan.nextInt();
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		float n1, n2;
		System.out.print("\n\nInforme n1: ");
		n1 = scan.nextFloat();
		System.out.print("Informe n2: ");
		n2 = scan.nextFloat();
		
		System.out.println("\nOperações");
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " ÷ " + n2 + " = " + (n1 / n2));
		
		scan.close();
	}
}
