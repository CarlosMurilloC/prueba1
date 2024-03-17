package Repaso;

import java.util.Scanner;

/**
 * Solicitar por teclado la estación del año favorita del usuario (primavera,
 * verano, otoño o invierno).
 * 
 * Una vez que el usuario introduzca la estación mostrar un mensaje por consola
 * indicando algo característico que se realiza en esa estación del año.
 * 
 * Si la estación del año favorita es verano además deberás preguntar al usuario
 * si veranea en la playa y en caso de que responda que sí mostrarle los nombres
 * de algunas playas de Murcia.
 */
public class Tarea3R {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	String estacion = "";
	System.out.println("Introduzca estación del año favorita: ");
	estacion = sc.nextLine().toUpperCase().toLowerCase().trim();
	
	switch (estacion) {
	case "Invierno":
		System.out.println("Estamos en: " + estacion);
		break;
	case "Primavera":
		System.out.println("Estamos en: " + estacion);
		break;
	case "Verano":
		System.out.println("Estamos en: " + estacion);
		System.out.println("Te gusta la playa?");
		String respuesta = sc.nextLine();
		if(respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("Si")) {
			System.out.println("Te recomendamos ir a La Manga, Mazarron...");
		}else if (respuesta.equalsIgnoreCase("N") || respuesta.equalsIgnoreCase("No")) {
			System.out.println("Te deseamos que disfrutes igualmente");
		}else {
			System.out.println("Creo que eres más de campo o ciudad...");
		}
		System.out.println("FIN");

		System.out.println("Gracias por su atencion");
		
	}
	

	}

}
