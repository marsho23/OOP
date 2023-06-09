package qa.com.person;
import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.setName(name);
		this.age = age;
		this.jobTitle=jobTitle;
	}
	
	public String intro() {
		String intro = "My name is "+getName()+" and I am "+age+" years old. My job title is "+jobTitle;
		return intro;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}
}
