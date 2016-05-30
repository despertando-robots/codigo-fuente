/*
***************************************************
** Dspertando Robots          Desafio stem ********
***************************************************
** Ladrillo RCX               lb02         ********
***************************************************
** Muestra todos los numeros pares hasta el cien **
***************************************************
*/

import josx.platform.rcx.LCD; // Clase LCD de LEJOS

public class lb02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub

    	   LCD.clear();
		
	   for (int i=0; i<=100; i=i+2){  // Bucle recorrido de los pares hasta 100
		
             LCD.showNumber(i);     // Muestra cada numero
  	     Thread.sleep(1000);    
	   }
		
	}

}
