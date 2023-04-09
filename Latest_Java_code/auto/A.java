package auto;

public class A {

	static {
		System.out.println("hi");
        System.exit(0); // prevents “main method not found” error
        test();
	}
	
	public static void test() {
		
	}

}
