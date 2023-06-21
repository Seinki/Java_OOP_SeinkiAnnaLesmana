import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class AppMain {

	public static void main(String[] args) {
		Person person1 = new Programmer("Seinki", "Bandung", "Java");
		Person person2 = new Teacher("Anna", "Cimahi", "Fisika");
		Person person3 = new Doctor("Lesmana", "Cibeureum", "Dentist");
		
		sayHello(person1);
		sayHello(person2);
		sayHello(person3);
		
		Person person4 = new Person();
		person4.setName("Seinki");
		person4.setAddress("Bandung");
		
		System.out.println(person4.getName());
		System.out.println(person4.getAddress());
		
		
	}
	
	static void sayHello(Person person) {
		String message;
		if (person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			message = "Hello " + programmer.getName() + ", Seorang Programmer " + programmer.technology + ".";
		} else if (person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "Hello " + teacher.getName() + ", Seorang Guru " + teacher.subject + ".";
		} else if (person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "Hello " + doctor.getName() + ", Seorang Dokter " + doctor.specialist + ".";
		} else {
			message = "Hello " + person.getName() + ".";
		}
		
		System.out.println(message);
	}

}
