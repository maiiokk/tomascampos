package ej27;

import java.util.Scanner;

public class ej27 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);

		int contraseņa = 270308;
		int intentos = 3;
		boolean NoTieneIntentos = false;
		
		do {

			System.out.println("Te quedan: " + intentos + " intentos");
			System.out.println("Ingresa contraseņa: ");

			contraseņa = datos.nextInt();
			intentos--;
			
			if(intentos == 0) {
				NoTieneIntentos = true;
			}
			
			if (contraseņa != 270308 && intentos >0  ) {
				System.out.println("Incorrecta. Volve a intentarlo.");
			}
			
			
			

		} while (contraseņa != 270308 && NoTieneIntentos == false);
	    
		
		  if (contraseņa == 270308) {
        System.out.println("Contraseņa correcta. Ingresando... ");
		}
		  else {
		System.out.println("Bloqueaste la PC.");

		  }	}
}
