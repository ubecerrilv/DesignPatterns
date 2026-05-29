package CreationalPatterns.AbstractFactory.Example01;

public class LinuxFactory implements AbstractFactory {

	@Override
	public Button createButon() {
		return new LinuxButton();
	}

	@Override
	public Scroll createScroll() {
		return new LinuxScroll();
	}

}
