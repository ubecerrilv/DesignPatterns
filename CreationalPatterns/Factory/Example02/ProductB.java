package Factory.Example02;

class ProductB extends Product {
	ProductB(String id) {
		this.id = id;
		System.out.println("Product B has been created with id: " + this.id);
	}
	
	@Override
	public void doSomething () {
		System.out.println("Product B with ID: " + this.id + " is doing something");
	}
}