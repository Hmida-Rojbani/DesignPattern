package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Componant {
	private List<Componant> shapes = new ArrayList<>();
	
	public void add(Componant obj) {
		shapes.add(obj);
	}
	
	public void render() {
		for (Componant obj : shapes) {
			obj.render();
		}
	}
}
