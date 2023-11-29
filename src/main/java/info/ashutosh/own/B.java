package info.ashutosh.own;

import java.io.FileNotFoundException;

public class B {

	public static String a = "aa";

	static {
		System.out.println("this is static block");
	}

	B() {
		System.out.println("B's constructor");
	}

	public void print() {
		System.out.println("B's method");
	}

	public void add(Object a) {
		System.out.println("Object a " + a);
	}

	public void add(Integer a) {
		System.out.println("Integer a " + a);
	}

	public void add(Float a) {
		System.out.println("Float a " + a);
	}

	public static void main(String[] args) throws FileNotFoundException {
		a = "bbb";
		System.out.println(a);
		B b = new B();
		b.add("1");
		name();

	}

	public static void name() throws FileNotFoundException {

	}
}