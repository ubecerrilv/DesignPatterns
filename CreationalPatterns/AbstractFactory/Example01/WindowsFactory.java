package CreationalPatterns.AbstractFactory.Example01;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button createButon() {
		return new WindowsButton();
	}

	@Override
	public Scroll createScroll() {
		return new WindowsScroll();
	}

}
