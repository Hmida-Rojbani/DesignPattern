package structural.adapter.otherfilters;

import structural.adapter.Image;

// filter
public class GrayFilter {
	
	public void init() {
		
	}
	
	public void render(Image image) {
		System.out.println("Applying Gray Filter");
	}

}
