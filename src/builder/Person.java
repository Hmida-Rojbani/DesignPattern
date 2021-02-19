package builder;

public class Person {
	//required
	private String name;
	private int cin;
	//optional 
	private int age;
	private String address;
	
	private Person(PersonBuilder personBuilder) {
		this.name = personBuilder.name;
		this.cin = personBuilder.cin;
		this.age = personBuilder.age;
		this.address = personBuilder.address;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", cin=" + cin + ", age=" + age + ", address=" + address + "]";
	}



	public static class PersonBuilder{
		//required
		private String name;
		private int cin;
		//optional 
		private int age;
		private String address;
		
		public PersonBuilder(String name, int cin) {
			super();
			this.name = name;
			this.cin = cin;
		}

		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder address(String address) {
			this.address = address;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

		
		
		
		
		
		
	}
}
