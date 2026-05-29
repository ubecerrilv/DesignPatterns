package CreationalPatterns.Factory.Example01;

class FactoryB extends Factory {
	
	@Override
	public Product createProduct () {
		return new ProductB();
	}
}