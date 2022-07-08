package application;

public class ReverterString {
	
	static String reverter(String str) {
	    String inverter = "";
	    for (int i = str.length() - 1;  0 <= i; i--) {
	        inverter += str.charAt(i);
	    }
	    return inverter;
	}

	public static void main(String[] args) {
		
		String str = "Diego Machado Alves Lins";
		System.out.println(reverter(str));
	}
}
