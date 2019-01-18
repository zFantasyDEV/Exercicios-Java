/*
 * 
 * Faça um programa que leia o intervalo númerico.
 * 
 */

package exercicios.java13;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double variavel = sc.nextDouble();
		
		if (variavel <= 25 && variavel >= 0) {
			System.out.println("Intervalo [0,25]");
		}else if (variavel >= 25 && variavel <= 50) {
			System.out.println("Intervalo (25,50]");
		}else if (variavel >= 75 && variavel <= 100) {
			System.out.println("Intervalo (75,100]");
		}else if (variavel < 0 || variavel > 100) {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
