package application;

import java.util.Locale;

public class Distribuidora {

	public static double percentual (double valor, double total) {
		return ((valor * 100) / total);
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double SP = 67836.43;
        double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros = 19849.53;
		
		double total = SP + RJ + MG + ES + Outros;
		
		System.out.printf("SP: %.2f%s%n", percentual(SP,total), "%");
		System.out.printf("RJ: %.2f%s%n", percentual(RJ,total), "%");
		System.out.printf("MG: %.2f%s%n", percentual(MG,total), "%");
		System.out.printf("ES: %.2f%s%n", percentual(ES,total), "%");
		System.out.printf("Outros: %.2f%s%n", percentual(Outros,total), "%");
	}
}
