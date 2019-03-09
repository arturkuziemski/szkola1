package first;

import java.util.ArrayList;

public class Cart {
	ArrayList<CartIteam> items = new ArrayList<>();
	ArrayList<IPromotions> promotions = new ArrayList<>();
	double promotionSumOfProducts = 0;
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartIteam it : items)
			sum += it.getProduct().getPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(CartIteam it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public ArrayList<CartIteam> getItems() {
		return items;
	}
	
	public Cart addProduct(Product p) {
		items.add(new CartIteam(p));
		promotionSumOfProducts += p.getPrice(); 
		return this;
	}

	public Cart addPromotion(IPromotions p) {
		promotions.add(p);
		return this;
	}
	
	public Cart applyPromotions(){
		for(IPromotions p : promotions){
			p.CalculateOffer(this);
		}
		return this;
	}
	@Override
	public String toString() {
		return "Cart [\n\titems=" + items 
				+ "\n\tpromotions=" + promotions 
				+ "\n\tpromotionSumOfProducts=" + promotionSumOfProducts + "]";
	}

}