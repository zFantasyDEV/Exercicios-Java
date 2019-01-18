/*
 * 
 * Fa�a um programa que indique quanto tempo o jogo durou.
 * 
 */

package exercicios.onze;

import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}
