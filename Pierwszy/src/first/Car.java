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
	
	
	
}
public String getBrand(){
	return brand;
}
public boolean isNew(){
	return isNew;
}
public void setNew(boolean itsNew){
this.isNew = isNew;
}
public int getMilleage(){
	return milleage;
}
public void setMileage(int milleage){
this.milleage = milleage;
}
public double getPrice(){
	return price;

}
public void setPrice(double Price){
this.price = price;
}
}