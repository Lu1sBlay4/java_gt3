package ejercicios.ejercicio2;

public class RptaEjF {

	public static void main(String[] args) {
//		Modificar ahora el m�todo main para  que imprima 
//		las tablas de multiplicar del n�mero 1 al 10. 
//		Cada tabla debe ir separada por un l�nea en blanco.
		
		// Respuesta de Manuel Corbillon
		for (int i=1; i<=10;i++) {
            for(int j=1; j<=10; j++) {
                System.out.println("Tabla de "+i+":"+i+"X"+j+"="+(i*j));
            }
        }

	}

}
