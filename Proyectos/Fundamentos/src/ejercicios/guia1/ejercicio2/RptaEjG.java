package ejercicios.guia1.ejercicio2;

import java.util.Scanner;

public class RptaEjG {

	public static void main(String[] args) {	
		// Respuesta de Manuel Corbillon
		
		 System.out.println("Introduzca un n�mero: \n");
	        Scanner sc = new Scanner(System.in);
	        int i = sc.nextInt();
	        
	        if (i>=0 && i<=50) {
	            System.out.println("Suspenso");
	        }else if(i>=51 && i<=75){
	            System.out.println("Recuperar");
	        }else if(i>=76 && i<=90) {
	            System.out.println("Aprobado");
	        }else if(i>=91 && i<=100) {
	            System.out.println("Aprobado con m�rito");
	        }else {
	            System.out.println("Puntuaci�n inv�lida");
	        }
		
	}

}
