package structural.adapter;

public class ImageView {
	
	private Image image;

	public ImageView(Image image) {
		super();
		this.image = image;
	}
	
	public void apply(Filter filter) {
		filter.apply(image);
	}
}
