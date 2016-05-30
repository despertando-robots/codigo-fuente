/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Motores                    mo01         ****
***********************************************
** Avance en linea recta                   ****
** en una baldosa de 40 x 40 cm            ****
***********************************************
*/


import josx.platform.rcx.Motor;


public class mo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{

		// TODO Auto-generated method stub
		
		// Avance en linea recta con los motores a la misma potencia

		Motor.A.forward();
		Motor.A.setPower(7);
		
		Motor.C.forward();
		Motor.C.setPower(7);
		
		Thread.sleep(800);
	}

}
