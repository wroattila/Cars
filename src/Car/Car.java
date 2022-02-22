package Car;

public class Car {

private static final int MAX_SPEED = 190;
	
	public Color colorOfNextCar;
	private int currentSpeed;
	private int currentGear;
	
	public Car() {
	
	}
	
	
	

	public void speedUp(int increment) {
		
		currentSpeed += increment; 
		
		
			
	}

	public void slowDown(int decrement) {
		currentSpeed -= decrement;
	}
	
	public void changeGear(int gear) {
		currentGear = gear;
	}

	@Override
	public String toString() {
		return "color=" + colorOfNextCar + ", currentSpeed=" + currentSpeed + ", currentGear=" + currentGear;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public int getCurrentGear() {
		return currentGear;
	}
}
