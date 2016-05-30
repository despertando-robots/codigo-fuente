/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Circuitos                  ci010        ****
***********************************************
** Desplazamiento entre los puntos 0-2-3-4 ****
** y regreso al 0 del circuito diseñado    ****
***********************************************
** Con uso de métodos para manejo de motores **
***********************************************
*/

import josx.platform.rcx.Motor;

public class ci02340 {

	//Se introduce la potencia con la que se van a mover los motores

	public static void potencia( int potencia ) throws InterruptedException
	{
	  Motor.A.setPower(potencia);
	  Motor.C.setPower(potencia);
	}
	
	//Avanza hasta un tiempo determinado el cual le introducimos

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
	
	//Giro a la derecha

	public static void derecha ( int milisegundos ) throws InterruptedException
	{
	  Motor.A.forward();
	  Motor.C.backward();
	  Thread.sleep(milisegundos);
	  
	  Motor.A.forward();
	  Motor.C.forward();
	}
	
	//Giro hacia la izquierda
	public static void izquierda ( int milisegundos ) throws InterruptedException
	{
	  Motor.A.backward();
	  Motor.C.forward();
	  Thread.sleep(milisegundos);
	  
	  Motor.A.forward();
	  Motor.C.forward();
	}
	
	//Paro los motores
	public static void alto() throws InterruptedException
	{
	  Motor.A.stop();
	  Motor.C.stop();
	}
	
public static void main(String[] args) throws InterruptedException{
	// TODO Auto-generated method stub
	
	// Paso del punto 0 al 2

	potencia(5);
	derecha(525);           // GIRO A LA DERECHA
	alto();
	Thread.sleep(700);


	avanza(2100);
	alto();			// AVANCE
	Thread.sleep(700);

	// Paso del punto 2 al 3 y del 3 al 4

	derecha(790);		// GIRO A LA DERECHA
	alto();
	Thread.sleep(700);


	avanza(1900);		// AVANCE DEL 2 AL 4
	alto();
	Thread.sleep(700);

	// Paso del punto 4 al 0 

	derecha(870);		// GIRO A LA DERECHA	
	alto();
	Thread.sleep(700);

	avanza(2250);		// aVANCE
	alto();
	Thread.sleep(700);

	derecha(470);		// vUELTA A POSICION INICIAL
	alto();
	
	
	
	
	
	
	
	
}	
	


}
	




