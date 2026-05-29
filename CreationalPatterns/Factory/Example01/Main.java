package CreationalPatterns.Factory.Example01;

/**
* This main file shows the use of the factory method pattern.
*  @author Ulises Becerril Valdés
*  @date 27/05/2026
*/
public class Main{
	public static void main (String [] args) {
		Factory factory;
		
		// Create the product acording to the conditions needed
		String OS = "Linux";
		if(OS == "Linux")
			factory = new FactoryA();
		else
			factory = new FactoryB();
		
		// Create and use the product
		Product product = factory.createProduct();
		product.doSomething();
	}
}