package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.print("Informe o 1º salário: ");
		s1 = scan.nextLine().replace(",", ".");
		System.out.print("Informe o 2º salário: ");
		s2 = scan.nextLine().replace(",", ".");
		System.out.print("Informe o 3º salário: ");
		s3 = scan.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(s1);
		double salario2 = Double.parseDouble(s2);
		double salario3 = Double.parseDouble(s3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("\nMédia dos salários: %.3f", media);
		
		scan.close();
	}
}
