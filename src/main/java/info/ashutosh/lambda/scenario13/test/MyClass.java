package info.ashutosh.lambda.scenario13.test;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyClass {

	private static Double staticField;
	private static final Boolean STATIC_FINAL_FIELD = null;
	private Float instanceField;
	private final Integer finalField;

	public static void main(String[] args) {
		System.out.println("MyClass.main()");
	}
	
}
