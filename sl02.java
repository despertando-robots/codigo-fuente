/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Sensor de luz              sl02         ****
***********************************************
** Se desplaza sobre una linea negra       ****
** hasta que termina dicha linea           ****
***********************************************
*/

import josx.platform.rcx.*;

public class sl02 {
	
	// Constante con el valores aproximado del color negro leido por el sensor

	static final int Negro = 36;

	/**
	 * @param args
	 */
					
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Puesta en marcha de los motores

		Motor.A.forward();
		Motor.A.setPower(3);
		Motor.B.forward();
		Motor.B.setPower(3);

		// Configuracion y activacion del sensor de luz

		Sensor.S2.setTypeAndMode(SensorConstants.SENSOR_TYPE_LIGHT, 
				 				 SensorConstants.SENSOR_MODE_PCT);
		Sensor.S2.activate();
		
		// Bucle de lectura del sensor
		// que termina cuando temina el color negro aproximado +-3

		int auch;

		do {
			Thread.sleep(1);
			auch = Sensor.S2.readValue();				
			Thread.sleep(1);

		}
		while ((auch >= (Negro-3)) && (auch <= (Negro +3)));
			
		// Paro los motores

		Motor.A.stop();
		Motor.B.stop();
		
	
	}
}