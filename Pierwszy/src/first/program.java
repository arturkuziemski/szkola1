package first;

public class program {

	public static void main(String[] args) {
		Car car = new Car("BMW",true,0,100000.99);
		car.printCar();
		System.out.println("=====> zamiana wartosci");
		car.setMilleage(100);
			}
	}
