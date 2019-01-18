/* 
 * 
 * faça um programa que leia o codigo e a quantidade e calcules
 * 
 */


package exercicios.algumacoisa;

import java.util.Locale;
import java.util.Scanner;

public class Cod {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double diabo;
		if (codigo == 1) {
			diabo = quantidade * 4.0;
		} else if (codigo == 2) {
			diabo = quantidade * 4.5;
		} else if (codigo == 3) {
			diabo = quantidade * 5.0;
		} else if (codigo == 4) {
			diabo = quantidade * 2.0;
		} else {
			diabo = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f", diabo);
	
		sc.close();
	}

}
