package JavaPractice;

public class StaticBlockQuestion5 {

	// Q6. Can we initialize member variables within static block ?

	
	String name;
	static int age;
	
	static {
		StaticBlockQuestion5 e1 = new StaticBlockQuestion5();
		e1.name = "Naveen";
		age = 25;
		
		System.out.println(e1.name + " " + age);
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
