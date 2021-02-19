package structural.adapter;

import structural.adapter.otherfilters.GrayFilter;

public class GrayAdpater extends GrayFilter implements Filter{

	@Override
	public void apply(Image image) {
		init();
		render(image);
		
	}

}
