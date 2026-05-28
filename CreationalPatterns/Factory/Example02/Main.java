package Factory.Example02;

/**
* This main file shows the use of the factory method pattern to reuse existing objects.
*  @author Ulises Becerril Valdés
*  @date 27/05/2026
*/
public class Main{
	public static void main (String [] args) {
		Factory factory;
		
		String OS = "Linuxs";
		if(OS == "Linux")
			factory = new FactoryA();
		else
			factory = new FactoryB();
		
		// Create and use the product
		Product product = factory.getProduct("01");
		product.doSomething();
		
		// Reuse the product
		Product product2 = factory.getProduct("01");
		product2.doSomething();
	}
}