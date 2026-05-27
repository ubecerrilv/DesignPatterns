import java.util.HashMap;
import java.util.Map;

abstract class Factory {
	protected Map<String, Product> cache = new HashMap<>();
	
	public Product getProduct (String id) {
		// Reuse the product id exists
		if(cache.containsKey(id)) {
			System.out.println("Reusing product");
			return cache.get(id);
		}else {
			// Create new product
			Product product = createProduct(id);
			cache.put(id, product);
			return product;
		}
	}
	
	protected abstract Product createProduct (String id);
}