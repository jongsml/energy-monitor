package nl.leon.energymonitor.model;

public class Person 
{

	private String id;
	private String name;
	private String surname;
	private int age;

	public Person() {
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
