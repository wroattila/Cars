package Car;

public class App {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		
		System.out.println(car);
		System.out.println(car);
		car.speedUp(140);
		car2.changeGear(2);
		car.slowDown(45);
		car2.slowDown(30);
		car.changeGear(4);
		car2.speedUp(10);
		
		System.out.println(car);
		System.out.println(car2);
		
		
		
		Car coloOfNextCar = new Car();
		Car.colorOfNextCar(BLACK);
		Car coloOfNextCar2 = new Car();
		Car.colorOfNextCar2(RED);
		Car car5 = new Car();
		Car car6 = new Car();
		System.out.println(coloOfNextCar);
		System.out.println(coloOfNextCar2);
		
	}

}
