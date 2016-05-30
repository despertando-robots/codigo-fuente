/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Motores                    mo04         ****
***********************************************
** Avance en linea recta y retroceso       ****
** en una baldosa de 40 x 40 cm            ****
***********************************************
** Con uso de métodos para control          ***
** de los motores                          ****
***********************************************
*/

import josx.platform.rcx.Motor;


public class mo04 {

	/**
	 * @param args
	 */

	// Método de establecimieto de potencia de motores 
	// pasada como parametro
	

	public static void potencia( int potencia ) throws InterruptedException
	{
	  Motor.A.setPower(potencia);
	  Motor.C.setPower(potencia);
	}

	// Método de avance hacia delante de los motores indicando 
	// el tiempo como parametro
	
	public static void avanza ( int milisegundos ) throws InterruptedException
	{
	  Motor.A.forward();
	  Motor.C.forward();
	  Thread.sleep(milisegundos);	  
	}
	
	// Método de avance hacia detras de los motores indicando 
	// el tiempo como parametro

	public static void retrocede ( int milisegundos ) throws InterruptedException
	{
	  Motor.A.backward();
	  Motor.C.backward();
	  Thread.sleep(milisegundos);
	}
	
	//Paro los motores

	public static void alto() throws InterruptedException
	{
	  Motor.A.stop();
	  Motor.C.stop();
	}
	
	// 
	// PROGRAMA PRINCIPAL :
	//  	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		// El tiempo de retroceso es menor ya que 
		// los engranajes generan mayor movimiento
		// hacia atras que hacia alante.
		
		potencia(7);

		avanza(850);

		alto();

		Thread.sleep(1500);

		retrocede(770);
	}	
		
	

}
