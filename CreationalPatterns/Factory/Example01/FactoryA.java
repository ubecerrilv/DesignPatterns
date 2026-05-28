package Factory.Example01;

class FactoryA extends Factory {
	@Override
	public Product createProduct () {
		return new ProductA();
	}
}