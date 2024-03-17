package Repaso;

import java.util.Scanner;

/**
 * Crear una aplicaci�n que solicite dos valores
 * num�ricos y mostrar cual es el n�mero mayor introducido o si son
 * iguales (indic�ndolo).
 */
public class Tarea2R {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	
		int num1 =0;
		int num2 =0;
		
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número 1 es mayor: " + num1);
			
		}else if (num2 > num1) {
			System.out.println("El número 2 es mayor: " + num2);
			
		}else {
			System.out.println("Ambos son iguales");
		}
		
		System.out.println("FIN");	
	}

}
