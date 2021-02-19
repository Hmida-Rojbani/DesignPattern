package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
	private Map<PointType,PointIcon> map = new HashMap<>();
	
	public PointIcon getPointIcon(PointType type) {
		// system cache
		// key -> Value
		if(!map.containsKey(type))
		{
			PointIcon p = new PointIcon(type, null);
			map.put(type, p);
		}
		return map.get(type);
	}

}
