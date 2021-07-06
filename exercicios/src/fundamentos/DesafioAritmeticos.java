package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		double numerador1 = 6 * (3 + 2);
		double denominador1 = 3 * 2;
		double numerador2 = (1 - 5) * (2 - 7);
		double denominador2 = 2;
		
		double numPot1 = Math.pow(numerador1, 2);
		double result1 = numPot1 / denominador1;
		
		double result2 = numerador2 / denominador2;
		double numPot2 = Math.pow(result2, 2);
		
		double result3 = result1 - numPot2;
		double numPot3 = Math.pow(result3, 3);
		double denominador3 = Math.pow(10, 3);
		
		double resultFinal = numPot3 / denominador3;
		System.out.printf("Resultado Final: %.0f", resultFinal);
	}
}
