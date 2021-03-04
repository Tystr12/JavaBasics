import java.util.ArrayList;

import java.util.*;


public class Iterate<T> {
	
	T ob;
	
	Iterate(T ob) {
		this.ob = ob;
	}

	public static void main(String[] args) {
		
		ArrayList<String> asd = new ArrayList<String>();
		
		ArrayList<String> asd2 = new ArrayList<String>();
		
		ArrayList<Object> fin = new ArrayList<Object>();
		
		asd2.add("apple");
		asd2.add("banana");
		asd2.add("siffen");
		asd2.add("grapefruit");
		
		asd.add("apple");
		asd.add("banana");
		asd.add("siffen");
		asd.add("dragonfruit");
		
		Iterator it = asd.iterator();
		Iterator it2 = asd2.iterator();
		
		/*
		 * while (it.hasNext()) { System.out.println(it.next()); }
		 */
		
		
		while(it.hasNext() && it2.hasNext()) {
			Object one = it.next();
			Object two = it2.next();
			
			if(one.equals(two)) {
				fin.add(one);
				System.out.println(fin);
			} else if (!one.equals(two)) {
				System.out.println(one);
				System.out.println(two);
			}
		}
		
		
		//asd.remove("dragonfruit");
		//asd.remove("grapefruit");
		
		Iterator it3 = asd.iterator();
		Iterator it4 = asd2.iterator();
		
		// Testing if two iterators are equal.. Useful stuff
		boolean same = true;
		while(it3.hasNext()){
		  if(!it4.hasNext() || !it3.next().equals(it4.next())){
		    same = false;
		    break;
		    
		  }
		}

		System.out.println(same);
		System.out.println("Hei");
		
		
		
		

	}

}
