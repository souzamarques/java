package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações dos funcionários
		
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println("Anos de empresa: " + (anosDeEmpresa * 365) + " anos");
		
		// Numero de viagens
		System.out.println("Número de vôos: " + (numeroDeVoos / 2) + " vôos");
		
		// Pontos por real
		System.out.println("Pontos: " + (pontosAcumulados / vendasAcumuladas));
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias ? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
