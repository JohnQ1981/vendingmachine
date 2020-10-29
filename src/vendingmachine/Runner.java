package vendingmachine;

public class Runner {

	public static void main(String[] args) {
		//double accountBalance = 10;
		System.out.println("Hello, Welcome to our store?");
		Products product = new Products();
		
		Methods method = new Methods();
		double accountBalance =0;
		accountBalance = method.getMoney(accountBalance);
		
		//method.select(product);
		product.setPrice(method.select(product));
		accountBalance=method.balance(product.getPrice(), accountBalance, product);
		method.puchase(product.getPrice(), accountBalance, product);
		//System.out.println(method.select(product));
		
		//System.out.println(product.toString());

	}

}
