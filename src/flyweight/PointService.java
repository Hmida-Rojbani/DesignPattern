package flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
	
	public List<Point> getPoints(){
		PointIconFactory pf = new PointIconFactory();
		List<Point> points = new ArrayList<>();
		points.add(new Point(1,6, pf.getPointIcon(PointType.CAFE))); // chargement image
		points.add(new Point(1,2, pf.getPointIcon(PointType.RESTAURENT))); // chargement image
		points.add(new Point(5,9,pf.getPointIcon(PointType.RESTAURENT))); 
		return points;
	}
}
