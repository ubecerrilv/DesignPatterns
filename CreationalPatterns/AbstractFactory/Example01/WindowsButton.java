package CreationalPatterns.AbstractFactory.Example01;

public class WindowsButton implements Button {

	@Override
	public void render() {
		System.out.println("Rendering windows button");
	}

	@Override
	public void whenPressed() {
		System.out.println("Windows button pressed");
	}

}
