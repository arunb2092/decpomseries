package JavaPractice;

public class PrintHelloWorld {
	
	static {
		main(new String[]{"naveen"});
		main(new String[]{"naveen"});

	}

	public static void main(String[] args) {
		System.err.println("hi");

		// Print Hello World without using semi colon (;)

		// 1
		if (System.out.printf("Hello World" + "\n") == null) {

		}

		// 2
		if (System.out.append("Hello World" + "\n") == null) {

		}

		// 3
		if (System.out.append("Hello World" + "\n").equals(null)) {

		}
		
		//4
		for(int i=0; i<1; System.out.println("Hello World")) {
			i++;
		}
		
		printNum(1);
		
		//
		
		
	}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			printNum(++num);
		}
	}

}
