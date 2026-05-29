package CreationalPatterns.Factory.Example01;

class ProductB implements Product {
	@Override
	public void doSomething () {
		System.out.println("Product B is doing something");
	}
}