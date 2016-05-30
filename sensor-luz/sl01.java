/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Sensor de luz              sl01         ****
***********************************************
** LEcturas de valores obtenidos con el    ****
** sensor de luz. Para obtener valores de  ****
** los colores blanco y negro              ****
***********************************************
*/
import josx.platform.rcx.*;


public class sl01 {
	

	/**
	 * @param args
	 */
					
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Configuracion del sensor de luz y activacion

		Sensor.S2.setTypeAndMode(SensorConstants.SENSOR_TYPE_LIGHT, 
								 SensorConstants.SENSOR_MODE_PCT);
		Sensor.S2.activate();
		Thread.sleep (5000);

		// Bucle de lectura infinito

		
		while (true){
			// Lectura del valor del sensor

			int auch=0;
			auch = Sensor.S2.readValue();

			// Lo muestro en el display

			LCD.clear();
			LCD.showNumber(auch);
			Thread.sleep(5000);
		}
	}
	
}
