package qa.com.person;

public class PersonExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Maryum",22,"trainee software engineer");
		System.out.println(p1.intro());
		
		Person p2 = new Person("Martin",27,"architect");
		System.out.println(p2.intro());
		
		Person p3 = new Person("Ellie",30,"receptionist");
		System.out.println(p3.intro());

	}

}
