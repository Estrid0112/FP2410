package lectorial03;

class Gen<T>{
	// have an attribute that we don't know the actual data type
	T data;
	public Gen() {
		this.data = null;
	}
	public Gen(T myData) {
		this.data = myData;
	}
	
	public void setData(T newValue){
		this.data = newValue;
	}
	
	public T getData() {
		return this.data;
	}
	
	public static void main(String[] args) {
		Gen<String> myGen = new Gen<String>();
		myGen.setData("Hello");
		System.out.println(myGen.getData());
		
		Gen<Integer> myInteger = new Gen<Integer>();
		myInteger.setData(1);
		System.out.println(myInteger.getData());
		
		Gen<Account> myAccount = new Gen<Account>();
		myAccount.setData(new Account("Alice", "s123", 0));
		System.out.println(myAccount.getData());
		
		// Note 1. Generics does not work with primitive data types
		Gen<Integer> myInt = new Gen<Integer>(); // primitive data type: double float
		// String Integer Double Account - reference data types - objects - subclass of Object 
		
		
		
	}
}
