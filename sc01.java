/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Sensor de contacto         sc01         ****
***********************************************
** Cuenta las veces que se pulsa el        ****
** sensor de contacto                      ****
***********************************************
*/
import josx.platform.rcx.*;

public class sc01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		// Configuracion del tipo y modo de trabajo del sensor de contacto
		// conectado al puerto 1

		Sensor.S1.setTypeAndMode(SensorConstants.SENSOR_TYPE_TOUCH, SensorConstants.SENSOR_MODE_PULSE);
		
		int veces = 0;
		
		LCD.clear();
		
		TextLCD.print("Pulse");
		
		Thread.sleep (10000);
		
		// Lectura de las veces que se pulsa el sensor de contacto
		// durante un cierto tiempo

		veces = Sensor.S1.readValue();
		
		LCD.clear();
		
		LCD.showNumber(veces);
		
		Thread.sleep(100000000);
		
		
	}

}
