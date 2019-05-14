package JavaPractice;

public class Test1 {

	 static int a = 5;
	 int b = 10;

	public static void main(String[] args) {
		// here t1 and t2 will have a separate copy of b
		// while they will have same copy of a because it is declared a static
		Test1 t1 = new Test1(); 
		Test1 t2 = new Test1();
			
		Test1.a = 3;
		System.out.println(t1.a); // print out - 3
		System.out.println(t2.a); // print out - 3
		
		
		t1.b = 12;
		System.out.println(t1.b);// print out - 12
		System.out.println(t2.b);// print out - 10
	}
}