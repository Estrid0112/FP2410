package lectorial03;

class GenMultiple<K, V>{
	K key;
	V value;
	
	public K getKey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setKey(K newValue) {
		this.key = newValue;
	}
	
	public void setValue(V newValue) {
		this.value = newValue;
	}
	
	public static void main(String[] args) {
		GenMultiple<String, Double> product = new GenMultiple<String, Double>();
		product.setKey("Apple");
		product.setValue(5.0);
		
		System.out.println("Product name: " + product.getKey());
	}
	
	
	
	
	
}
