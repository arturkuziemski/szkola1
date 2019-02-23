package first;

public class program {

	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "BMW";
		car.itsNew = true;
		car.milleage=0;
		car.price=100000.99;
		System.out.println("Marka:" + car.brand);
		System.out.println("Nowy:" + car.itsNew);
		System.out.println("Przebieg:" + car.milleage);
		System.out.println("Cena:" + car.price);
		System.out.println(car);
			}
	}
