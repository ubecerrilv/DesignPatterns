package CreationalPatterns.Factory.Example02;

class ProductA extends Product {
	ProductA(String id) {
		this.id = id;
		System.out.println("Product A has been created with id: " + this.id);
	}
	
	@Override
	public void doSomething () {
		System.out.println("Product A with ID: " + this.id + " is doing something");
	}
}