package structural.adapter;

import structural.adapter.otherfilters.GrayFilter;

public class GrayFilterAdapter implements Filter{
	
	private GrayFilter gray;
	
	public GrayFilterAdapter(GrayFilter gray) {
		super();
		this.gray = gray;
	}



	@Override
	public void apply(Image image) {
		gray.init();
		gray.render(image);
		
	}

}
