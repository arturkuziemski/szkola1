package first;

public class CartIteam {
	private Product product;
	private double currentPrice;
	
	public CartIteam(Product product){
		this.product = product;
		this.currentPrice = product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public String toString() {
		return "CartItem [" + product + ", " + currentPrice + "]";
	}
}
