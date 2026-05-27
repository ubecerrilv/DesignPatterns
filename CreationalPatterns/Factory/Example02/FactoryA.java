class FactoryA extends Factory {
	@Override
	protected Product createProduct (String id) {
		return new ProductA(id);
	}
}