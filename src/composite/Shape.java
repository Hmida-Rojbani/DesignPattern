package composite;

public class Shape implements Componant{

	private String type;

	public Shape(String type) {
		super();
		this.type = type;
	}

	public void render() {
		System.out.println("Shape is rendered :" + type);
	}
}
