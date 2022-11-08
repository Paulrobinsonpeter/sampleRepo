package hashMap;

import java.util.HashMap;
import java.util.Iterator;



public class UseCustomerDetails {
	public static void main(String[] args) {
		CustomerDetails cd1=new CustomerDetails("robi",27,"robi@gmail.com",1234567890l,15000,true);
		CustomerDetails cd2=new CustomerDetails("deep",28,"deep@gmail.com",1234567892l,15000,true);
		CustomerDetails cd3=new CustomerDetails("loki",25,"loki@gmail.com",1234567893l,1000,true);
		CustomerDetails cd4=new CustomerDetails("raj",25,"raj@gmail.com",1234567894l,10000,true);
		CustomerDetails cd5=new CustomerDetails("vao",18,"rao@gmail.com",1234567895l,15000,false);
		
		HashMap<Long,CustomerDetails> a=new HashMap<>();
		a.put(cd1.getAadharNumber(), cd1);
		a.put(cd2.getAadharNumber(), cd2);
		a.put(cd3.getAadharNumber(), cd3);
		a.put(cd4.getAadharNumber(), cd4);
		a.put(cd5.getAadharNumber(), cd5);
		
		
		for(Long x:a.keySet()) {
			System.out.println(x);
			
		}
		for(CustomerDetails x:a.values()) {
			System.out.println(x);
			
		}
		a.keySet().forEach(x->System.out.println(a.get(x)));
		
		for(CustomerDetails x:a.values()) {
			if(x.getName().startsWith("v")) {
				System.out.println(x.getName());
			}
			
		}
		a.values().forEach(x->{if(x.getName().equals("robi")) {System.out.println(x);}});
		System.out.println(" ");
		a.values().forEach(x->{if(x.getisMale()==true) {System.out.println(x);}});
		
		System.out.println(" ");
		
		
		int y=cd1.getAge();
		for(CustomerDetails x:a.values()) {
			if(x.getAge()>=y) {
				y=x.getAge();
				
			}
			System.out.println(x);
		}
		System.out.println(" ");
		
		//iterator while and do while
		
		Iterator<CustomerDetails> b=a.values().iterator();
		while(b.hasNext()) {
			if(b.next().getAge()>=18) {
				b.remove();
			}
			
		}
		a.forEach((z,x)->System.out.println(z+" "+x));
		
		Iterator<CustomerDetails> c=a.values().iterator();
		while(c.hasNext()) {
			if(c.next().getisMale()==true) {
				c.remove();
			}
			
		}
		a.forEach((z,x)->System.out.println(z+" "+x));
		
	/*	while(c.hasNext()) {
			if(c.next().getAmountavaiable()==10000) {
				c.remove();
			}
		}
		a.forEach((z,x)->System.out.println(z+" "+x)); */
		
		
		while(c.hasNext()) {      //remove particular employee list
			if(c.next().getAadharNumber()==cd3.getAadharNumber()) {
				c.remove();
			}
		}
		a.forEach((z,x)->System.out.println(z+" "+x));
		
		
		
		
		
		
		
	}

}
