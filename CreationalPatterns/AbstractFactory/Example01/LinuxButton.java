package CreationalPatterns.AbstractFactory.Example01;

public class LinuxButton implements Button {

	@Override
	public void render() {
		System.out.println("Rendering linux button");
	}

	@Override
	public void whenPressed() {
		System.out.println("Linux button pressed");
	}

}
