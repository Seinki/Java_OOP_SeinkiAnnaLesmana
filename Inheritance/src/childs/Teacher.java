package childs;
import parents.Person;

public class Teacher extends Person {
	public String subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String name, String address, String subject) {
		super(name, address);
		this.subject = subject;
	}

	public void teaching() {
		System.out.println("I can teach " + subject + ", So anyone how wants to learn can talk to me.");
	}
	
	public void greeting() {
		super.greeting();
		System.out.println("My job is a " + subject + " teacher.");
	}

	//getter and setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
