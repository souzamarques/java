package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		Scanner scan = new Scanner(System.in);
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		double fah, cel;
		
		System.out.print("Informe a temperatura Fahrenheit: ");
		fah = scan.nextDouble();
		
		cel = (fah - ajuste) * fator;
		System.out.println(fah + "ºF em Celsius é: " + cel + "ºC");
		
		scan.close();
	}

}
