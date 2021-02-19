package flyweight;

public class Point {
	
	private int x;
	private int y;
	private PointIcon pointIcon;
	
	public Point(int x, int y, PointIcon pointIcon) {
		super();
		this.x = x;
		this.y = y;
		this.pointIcon = pointIcon;
	}
	
	public void draw() {
		System.out.printf("%s at (%d,%d)\n", pointIcon.getType(), x,y);
	}
  
}
