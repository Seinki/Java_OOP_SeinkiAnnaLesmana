
public class MainApp {

	public static void main(String[] args) {
		//Membuat objek dari class person menggunakan constructor parameter
		Person person1 = new Person("Anna", "Bandung");
		person1.sayHello("Seinki");
		System.out.println(person1.sayAddress());
		
		//Membuat objek dari class person menggunakan constructor default
		Person person2 = new Person();
		person2.name = "Seinki";
		person2.address = "Bandung";
		person2.sayHello("Anna");
		System.out.println(person2.sayAddress());
		
		//Membuat objek dari class person menggunakan constructor dsatu parameter
		Person person3 = new Person("Lesmana");
		person3.address = "Bandung";
		person3.sayHello("Seinki dan Anna");
		System.out.println(person3.sayAddress());
		
	}

}
