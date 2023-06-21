
public class Person {
	String name;
	String address;
	final String country = "Indonesia";
	
	//Constructor default
	Person() {
		
	}
	//Constructor with one parameter
	Person(String paramName) {
		name = paramName;
	}
	//Constructor with parameter
	Person(String paramName, String paramAddress) {
		this(paramName);
		address = paramAddress;
	}
	
	//Method void
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", my name is " + name + ".");
	}
	
	//Method return value
	String sayAddress() {
		return "I came from " + address + ".";
	}
}
