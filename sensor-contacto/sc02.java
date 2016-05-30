/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Sensor de contacto         sc02         ****
***********************************************
** Espera hasta que pulsen el sensor de    ****
** contacto, para despues emitir un beep   ****
***********************************************
*/
import josx.platform.rcx.*;

public class sc02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		// Configuracion del tipo y modo de trabajo del sensor de contacto
		// conectado al puerto 1

		Sensor.S1.setTypeAndMode(SensorConstants.SENSOR_TYPE_TOUCH, SensorConstants.SENSOR_MODE_BOOL);

		// Bucle de espera hasta que pulsen el sensor
		
		boolean pulsado = false;
		
		while (!pulsado) {
			
			pulsado = Sensor.S1.readBooleanValue();
			
			Thread.sleep (3);
			
		}
		
		// Emite un sonido durante un segundo

		Sound.buzz();
		
		Thread.sleep(1000);
		
	}

}
