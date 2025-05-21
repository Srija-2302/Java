package Day2;

class BulkStockException extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BulkStockException(String productName) {
	     super("Error: The " + productName + " cannot be ordered in quantities of more than 10 units.");
	 }
	}

	class ShoppingCart {
	 public void addToCart(String productName, int quantity) throws BulkStockException {
	     if (quantity > 10) {
	         throw new BulkStockException(productName);
	     } else {
	         System.out.println(quantity + " units of " + productName + " added to the cart.");
	     }
	 }
	}
	public class Package9 {
	 public static void main(String[] args) {
	     if (args.length < 2) {
	         System.out.println("Please provide product name and quantity as command line arguments.");
	         return;
	     }

	     String productName = args[0];
	     int quantity;

	     try {
	         quantity = Integer.parseInt(args[1]);

	         ShoppingCart cart = new ShoppingCart();
	         cart.addToCart(productName, quantity);

	     } catch (NumberFormatException e) {
	         System.out.println("Please enter a valid number for quantity.");
	     } catch (BulkStockException e) {
	         System.out.println(e.getMessage());
	     }
	 }
	}

