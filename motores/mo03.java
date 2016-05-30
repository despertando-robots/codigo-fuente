/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Motores                    mo03         ****
***********************************************
** Movimientos de 180 grados               ****
** en una baldosa de 40 x 40 cm            ****
***********************************************
*/


import josx.platform.rcx.Motor;



public class mo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Avance hacia adelante de los dos motores a misma potencia

		Motor.A.forward();
		Motor.A.setPower(4);
		
		Motor.C.forward();
		Motor.C.setPower(4);
		
		Thread.sleep(100);
		
		// Giro pivotando hacia la derecha parando un motor

		Motor.A.forward();
		Motor.A.setPower(6);
		
		Motor.C.backward();
		Motor.C.setPower(0);
		
		Thread.sleep(150);
		
		// Giro hacia la derecha con diferencia de potencias

		Motor.A.forward();
		Motor.A.setPower(6);
		
		Motor.C.forward();
		Motor.C.setPower(2);
		
		Thread.sleep(500);
		
	
		// Giro pivotando hacia la derecha parando un motor

	
		Motor.A.forward();
		Motor.A.setPower(7);
	
		Motor.C.backward();
		Motor.C.setPower(0);
					
		
		Thread.sleep(1700);
		
	
		// Avance hacia delante con misma potencia
		
		Motor.A.forward();
		Motor.A.setPower(4);
		
		Motor.C.forward();
		Motor.C.setPower(4);
		
		Thread.sleep(500);

	
		// Giro pivotando hacia la derecha parando un motor
		
		Motor.A.forward();
		Motor.A.setPower(6);
		
		Motor.C.backward();
		Motor.C.setPower(0);
		
		Thread.sleep(200);
		
	}
}
