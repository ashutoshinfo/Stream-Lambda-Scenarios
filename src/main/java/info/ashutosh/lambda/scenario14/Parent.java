package info.ashutosh.lambda.scenario14;

public class Parent {

	public Object name1() {
		System.out.println("()");
		return null;

	}

	protected Object name1(int i) throws Exception {
		System.out.println("Oject()");

		return null;

	}
}

class Child extends Parent {

	public String name1(int i) {
		System.out.println("int i");
		return null;

	}
	
	

	public static void main(String[] args) throws Exception {

		Parent p = new Child();
		p.name1(1);
		p.name1();

		Child p2 = new Child();
		p2.name1(1);
		p2.name1();

		Parent p3 = new Parent();
		p3.name1(2);
		p3.name1();
	}
}
