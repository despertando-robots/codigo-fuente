/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Motores                    mo05         ****
***********************************************
** Avance de 180 grados                    ****
** en una baldosa de 40 x 40 cm            ****
***********************************************
** Con uso de métodos para control          ***
** de los motores                          ****
***********************************************
*/

import josx.platform.rcx.Motor;

public class mo05 {

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

	//
	//  PROGRAMA PRINCIPAL
	//	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
	
		// El tiempo de retroceso es menor ya que 
		// los engranajes generan mayor movimiento
		// hacia atras que hacia alante.
	
		potencia(5);

		derecha(525);
		alto();
		Thread.sleep(700);

		avanza(2100);
		alto();
		Thread.sleep(700);

		derecha(790);
		alto();
		Thread.sleep(700);
		avanza(1900);
		alto();

		Thread.sleep(700);
		derecha(870);
		alto();
		Thread.sleep(700);

		avanza(2250);
		alto();
		Thread.sleep(700);

		derecha(470);
		alto();

	}	
	
}
	




