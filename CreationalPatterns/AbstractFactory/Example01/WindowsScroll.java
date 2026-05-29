package CreationalPatterns.AbstractFactory.Example01;

public class WindowsScroll implements Scroll {

	@Override
	public void render() {
		System.out.println("Rendering windows scroll");
	}

	@Override
	public void scroll() {
		System.out.println("Scrolling with windows scroll");
	}

}
