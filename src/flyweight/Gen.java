package flyweight;

import java.util.Vector;

public class Gen <T>{
	 T obj;
	 public T getElm() {
		 return obj;
	 }
	 
	 public static void main(String[] args) {
		Vector<String> v = new Vector();
		
		v.add("str");
		
		
		String s =  v.get(0);
		
	}
}
