/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Circuitos                  ci01         ****
***********************************************
** Desplazamiento entre los puntos 0 y 1   ****
** del circuito diseñado                   ****
***********************************************
*/

import josx.platform.rcx.Motor;


public class ci01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		// Puesta en marcha de motores
		// y desplazamiento en linea recta
		// entre los puntos 0 y 1

		Motor.A.forward();
		Motor.A.setPower(7);
		
		Motor.C.forward();
		Motor.C.setPower(7);
		
		Thread.sleep(800);
		
	
	}

}
