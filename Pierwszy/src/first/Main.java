package first;


public class Main {

	public static void main(String[] args) {

		Cart cart = new Cart();
		cart.addProduct(new Product("Kartofle", 200))
		    .addProduct(new Product("Gazeta", 100))
		    .addPromotion(new ValuePromotion())
		    .applyPromotions();

		System.out.println(cart);

		cart.addPromotion(new MugPromotions())
		    .applyPromotions()
		    .applyPromotions();

		System.out.println(cart);
	}
}
