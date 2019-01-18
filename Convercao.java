/*

	1° Escreva um programa para ler uma temperatura em graus  celsius, calcular e escrever em fahrenheit

*/

package exercicios.convercao;

import java.util.Locale;
import java.util.Scanner;

public class Convercao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva e temperatura em graus celsius");
		double C, Co;
		
		C = sc.nextDouble();
		Co = 1.8*C + 32;
		
		System.out.println("Resultado: " + Co);
		
		sc.close();
	}
	
}
