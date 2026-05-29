package CreationalPatterns.AbstractFactory.Example01;

/**
* This main file shows the use of the abstract factory method pattern.
*  @author Ulises Becerril Valdés
*  @date 29/05/2026
*/

public class Main {
	public static void main(String[] args) {
		String OS= args.length == 0 ? "Linux": args[0];

		// Create abstract factory
		AbstractFactory factory;
		
		if(OS == "Linux") {
			factory = new LinuxFactory();
		}else {
			factory = new WindowsFactory();
		}
		
		// Use the factory to create products
		Button button = factory.createButon();
		Scroll scroll = factory.createScroll();
		
		// Use the products
		button.render();
		button.whenPressed();
		
		scroll.render();
		scroll.scroll();
	}
}
