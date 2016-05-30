/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Ladrillo RCX               lb03         ****
***********************************************
** Muestra los pares hasta 1000, al pulsar ****
** el boton VIEW muestra los impares       ****   
** y reproduce un beep                     ****         
** si no lo pulsan, no los muestra         ****
***********************************************
*/

import josx.platform.rcx.Button;  // Clase Button
import josx.platform.rcx.LCD;     // Clase LCD
import josx.platform.rcx.Sound;   // Clase Sound


public class lb03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	   LCD.clear();
		
           boolean p = false;
		
	   int i=0;
		
           while (i<=1000 && p == true) {

	      LCD.showNumber(i); //Muestra numeros pares
	      Thread.sleep(100);
				
	      p=Button.VIEW.isPressed();  // Compruebo si han pulsado Boton VIEW

      	      i= i+2;
  	   }
	
		
	   // Si han pulsado el boton muestro los impares

           if (p == true){

	      
	      Sound.beep();            // Reproduce un beep
	      Thread.sleep(1000);    

              for (i=1; i<=1000; i=i+2){  // Bucle recorrido de los pares hasta 100
		
                LCD.showNumber(i);     // Muestra cada numero
  	        Thread.sleep(1000);    
	      }
           }
	}

}

