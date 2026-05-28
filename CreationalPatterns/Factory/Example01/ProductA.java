package Factory.Example01;

class ProductA implements Product {
	@Override
	public void doSomething () {
		System.out.println("Product A is doing something");
	}
}