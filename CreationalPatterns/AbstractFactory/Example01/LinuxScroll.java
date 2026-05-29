package CreationalPatterns.AbstractFactory.Example01;

public class LinuxScroll implements Scroll {

	@Override
	public void render() {
		System.out.println("Rendering linux scroll");
	}

	@Override
	public void scroll() {
		System.out.println("Scrolling with linux scroll");
	}

}
