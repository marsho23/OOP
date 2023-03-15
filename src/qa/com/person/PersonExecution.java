package qa.com.person;
import java.util.ArrayList;
import java.util.List;

public class PersonExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Maryum",22,"trainee software engineer");
		System.out.println(p1.intro());
		
		Person p2 = new Person("Martin",27,"architect");
		System.out.println(p2.intro());
		
		Person p3 = new Person("Ellie",30,"receptionist");
		System.out.println(p3.intro());
		
		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		Person personFound = findPerson(people,"Maryum");
		System.out.println(personFound.intro());
	}

	public static Person findPerson(List<Person> people, String nameToBeFound) {
		Person personFound=null;
		for (Person person:people) {
			if (person.getName().equals(nameToBeFound))
				personFound=person;
		}
		return personFound;
	}
}
