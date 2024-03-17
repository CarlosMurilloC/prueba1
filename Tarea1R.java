package Repaso;

import java.util.*;

/**
 * Crea una aplicacion que muestre el nombre del cliente y la cantidad
 *         de art�culos comprados.
 * 
 *         Evaluar el n�mero de art�culos comprados y segun esto mostrar un
 *         mensaje indicando c�mo deber� pagar el cliente:
 * 
 *         Si la cantidad es menor de 5 pagara en efectivo, si es mayor de 5 y
 *         menor de 12 pagara con tarjeta, si es mayor de 13 pagara con cheque.
 */

public class Tarea1R {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int articulos =0;
		String nombre = "";
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Indique cantidad de artículos: ");
		articulos = sc.nextInt();
		
		if (articulos <= 5) {
			System.out.println("Pagará en efectivo...!");
			
		}else if (articulos >5 && articulos <=12) {
			System.out.println("Pagará con tarjeta...!");
			
		}else if (articulos >12) {
			System.out.println("Pagará con cheque");
			
		}else {
			System.out.println("No se contempla");
			
		}
		System.out.println("FIN");
	}
	
}

