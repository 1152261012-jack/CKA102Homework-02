package DMEO;

public class StudentTest {
	
	public static void main(String[] args) {
		Student david = new Student();
		Student james = new Student();
		

		david.play(2);
		david.study(6);
		
		james.play(5);
		james.study(2);
		
		System.out.println("===========");
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		
	}
}
