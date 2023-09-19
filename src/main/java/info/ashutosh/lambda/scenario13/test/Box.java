package info.ashutosh.lambda.scenario13.test;

// Define a generic class
class Box<T,S> {
	private T value1;
	private S value2;

	public Box(T value1,S value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value) {
		this.value1 = value;
	}
	
	public S getValue2() {
		return value2;
	}
	
	public void setValue2(S value) {
		this.value2 = value;
	}

	public static void main(String[] args) {
		// Create a Box for Integer
		Box<Integer,String> intBox = new Box<>(42,"String");
		int intValue1 = intBox.getValue1();
		String intValue2 = intBox.getValue2();
		System.out.println("Integer Value1: " + intValue1);
		System.out.println("Integer Value2: " + intValue2);
//
//		// Create a Box for String
//		Box<String> stringBox = new Box<>("Hello, Generics!");
//		String stringValue = stringBox.getValue();
//		System.out.println("String Value: " + stringValue);
//
//		// Create a Box for Double
//		Box<Double> doubleBox = new Box<>(3.14);
//		double doubleValue = doubleBox.getValue();
//		System.out.println("Double Value: " + doubleValue);
	}
}
