package parents;

public abstract class Product {
	private String name;

	public Product() {
		super();
	}
	
	public Product(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//abstrack method printInformation
	public  abstract void printInformation();
	
}
