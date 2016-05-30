/*
***********************************************
** Despertando Robots         Desafio Stem ****
***********************************************
** Sensor de contacto + Motor    hank      ****
***********************************************
** Movimiento independiente del robot      ****
** cuando se encuentra con un obstaculo    ****
** retrocede , gira para evitar el obstaculo **
** y sigue avanzando                       ****
***********************************************
*/
import josx.platform.rcx.Motor;
import josx.platform.rcx.Sensor;
import josx.platform.rcx.SensorConstants;



public class hank {

	// Metodo para girar a la derecha
	
	public static void giraDCHA (int milisegundos) throws InterruptedException
	{
		Motor.A.setPower(1);
		Motor.C.setPower(3);
		
		Motor.A.forward();
		Motor.C.backward();
		
		Thread.sleep(milisegundos);
	}
	
	// Metodo para girar a la izquierda

	public static void giraIZDA (int milisegundos) throws InterruptedException
	{
		Motor.A.setPower(3);
		Motor.C.setPower(1);
		
		Motor.A.backward();
		Motor.C.forward();
		
		Thread.sleep(milisegundos);
	}


	// Metodo para avanzar en linea recta

	public static void recto ()
	{
		Motor.A.setPower(2);
		Motor.C.setPower(2);
		
		Motor.A.forward();
		Motor.C.forward();
		
		
	}
	
	// Metodo para retroceder

	public static void atras (int milisegundos) throws InterruptedException
	{
		Motor.A.setPower(4);
		Motor.C.setPower(4);
		
		Motor.A.backward();
		Motor.C.backward();
		
		Thread.sleep(milisegundos);
		
		
	}
	
	/**
	 * @param args
	 */


	//
	// PROGRAMA PRINCIPAL 
	//

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		// Configuracion de los dos sensores de contacto

		Sensor.S1.setTypeAndMode(SensorConstants.SENSOR_TYPE_TOUCH, SensorConstants.SENSOR_MODE_BOOL);	
		Sensor.S3.setTypeAndMode(SensorConstants.SENSOR_TYPE_TOUCH, SensorConstants.SENSOR_MODE_BOOL);	
	
		boolean pulsadoIZDA = false;
		boolean pulsadoDCHA = false;
	
		// Pongo en marcha los motores la primera vez
	
		recto();
	
		// Bucle de infinito de movimiento
		// con control de contacto con el sensor
		// para girar y cambiar el sentido
	
		while (true) {
		
			// Control si se ha chocado por la izquierda o la derecha
			// para retroceder y girar en sentido contrario

			pulsadoIZDA = Sensor.S1.readBooleanValue();
			pulsadoDCHA = Sensor.S3.readBooleanValue();
		
			if (pulsadoIZDA) {
			
				atras(1500);

				giraDCHA(1500);
			
				recto();
				
			}
		
			if (pulsadoDCHA) {
			
				atras(1500);

				giraIZDA(1500);
			
				recto();
				
			}
		}
	
	}
}
