/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Circuitos                  ci010        ****
***********************************************
** Desplazamiento entre los puntos 0 y 1   ****
** y regreso al 0 del circuito diseñado    ****
***********************************************
** Con uso de métodos para manejo de motores **
***********************************************
*/

import josx.platform.rcx.Motor;


public class ci010 {

	/**
	 * @param args
	 */
	
	// Metodo de avence de los motores hacia delante

	public static void avanza ( int milisegundos ) throws InterruptedException
	{
	  Motor.A.forward();
	  Motor.C.forward();
	  Thread.sleep(milisegundos);	  
	}
	
	//Retrocede hasta un tiempo determinado el cual le introducimos

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
	
	//Se introduce la potencia con la que se van a mover los motores

	public static void potencia( int potencia ) throws InterruptedException
	{
	  Motor.A.setPower(potencia);
	  Motor.C.setPower(potencia);
	}
	
	
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