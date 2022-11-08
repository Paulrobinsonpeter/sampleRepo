package hashMap;

import java.util.HashMap;

public class LmsTest {
	public static void main(String[] args) {
		HashMap<Integer,String> lms=new HashMap<>();
		lms.put(777, "robi");
		lms.put(877, "nisa");   //used to insert keys and values
		lms.put(177, "loki");
		lms.put(77, "robi");
		lms.put(7, "nandu");
		
		for(Integer id:lms.keySet()) {        //using keySet method
			System.out.println(id+" "+lms.get(id));  //this method is 3rd get
		}
		for(Integer id:lms.keySet()) {
			System.out.println(id);
		}
		for(String id:lms.values()) {
			System.out.println(id);
		}
		lms.forEach((x,y)->System.out.println(x+" "+y));
		
		
		lms.keySet().forEach(x->System.out.println(x));
		
		
		lms.values().forEach(y->System.out.println(y));
		
		
		for(Integer x:lms.keySet()) {
			if(x%2==0) {
				System.out.println(x);
				
			}
			else {
				System.out.println("odd="+x);
			}
		}
		lms.values().forEach(x->{if(x.startsWith("n")) {System.out.println(x);}else{System.out.println(x+" does not contain n");}});
		
		for(Integer x:lms.keySet()) {
			if(lms.get(x).contains("a")||lms.get(x).contains("e")||lms.get(x).contains("o")) {
				System.out.println(lms.get(x)+" get vowels");
				
			}
		}
		
	}

}
