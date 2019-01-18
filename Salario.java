/*
 * 
 * Faça um programa que leia:
 * 
 * número do funcionario, horas, valor hora e calcule o salario.
 * 
 */

package exercicio.salario;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int ndf, hours;
			double vh, salary;
			
			ndf = sc.nextInt();
			hours = sc.nextInt();
			
			vh = sc.nextDouble();
			
			salary = vh * hours;
			
			System.out.println("NUMBER = " + ndf);
			System.out.printf("SALARY = %.2f", salary);
		
		sc.close();
	}

}
