package Factory.Example02;

class FactoryB extends Factory {
	@Override
	protected Product createProduct (String id) {
		return new ProductB(id);
	}
}