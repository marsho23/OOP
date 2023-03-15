package qa.com.person;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name=name;
		this.age = age;
		this.jobTitle=jobTitle;
	}
	
	public String intro() {
		String intro = "My name is "+name+" and I am "+age+" years old. My job title is "+jobTitle;
		return intro;
	}

}
