package first;

public class Car {
	private String brand;
	private boolean isNew;
	private int milleage;
	private double price;
Car(){
	System.out.println("Iniclalizacja Car()");
}

Car(String brand){
	this();
	this.brand = brand;
}
Car(String brand, boolean isNew, int milleage, double price){
	this (brand);
	this.isNew = isNew;
	this.milleage = milleage;
	this.price = price;	
}
void printCar(){
	System.out.println("Marka" + brand);
	System.out.println("Nowy" + isNew);
	System.out.println("Przebieg" + milleage);
	System.out.println("Cena" + price);
	
}
public String getBrand(){
	return brand;
}
public boolean isNew(){
	return isNew;
}
public void setNew(boolean itNew){
this.isNew = isNew;
}
public int getMilleage(){
	return milleage;
}
public void setMilleage(int milleage){
this.milleage = milleage;
}
public double getPrice(){
	return price;

}
public void setPrice(double Price){
this.price = price;
}
}