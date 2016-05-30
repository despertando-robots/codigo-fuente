/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Motores                    mo02         ****
***********************************************
** Movimiento de 90 grados                 ****
** en una baldosa de 40 x 40 cm            ****
***********************************************
*/


import josx.platform.rcx.Motor; // Clase Motor


public class mo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Giro pivotando hacia la derecha parando un motor
		
		Motor.A.forward();
		Motor.A.setPower(6);
		
		Motor.C.backward();
		Motor.C.setPower(0);
		
		Thread.sleep(400);

		
		// Avance hacia adelante de los dos motores a misma potencia

		Motor.A.forward();
		Motor.A.setPower(4);
		
		Motor.C.forward();
		Motor.C.setPower(4);
		
		Thread.sleep(400);

		
		// Giro pivotando hacia la derecha parando un motor

		Motor.A.forward();
		Motor.A.setPower(6);
		
		Motor.C.backward();
		Motor.C.setPower(0);
		
		Thread.sleep(400);

		
		// Avance hacia adelante de los dos motores a misma potencia

		Motor.A.forward();
		Motor.A.setPower(4);
		
		Motor.C.forward();
		Motor.C.setPower(4);
		
		Thread.sleep(475);

		
		// Giro pivotando hacia la derecha parando un motor
	
		Motor.A.forward();
		Motor.A.setPower(6);
		
		Motor.C.backward();
		Motor.C.setPower(0);
		
		Thread.sleep(350);
		
	}
}