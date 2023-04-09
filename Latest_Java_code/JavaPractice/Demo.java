package JavaPractice;

class Test {

	static {
		System.out.println("Test -- Static Block");
	}
	public final int x = 20;
}

public class Demo {
	public static void main(String[] args) {
		System.out.println(new Test().x);
	}
}