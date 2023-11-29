package info.ashutosh.own;

interface i {
	public void show();
}

final class Base implements i {

	final String s;
	
	public Base() {
		s=null;
	}
	
	public Base(String s) {
		super();
		this.s = s;
	}

	@Override
	public final void show() {
		System.out.println("Base::show() called");
	}
}

class Derived implements i {

	@Override
	public void show() {
		System.out.println("Derived::show() called");
	}
}

class Main {
	public static void main(String[] args) {
		i b = new Derived();
		b.show();
	}
}