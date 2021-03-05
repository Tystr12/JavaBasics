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
		
		ArrayList<Object> differance = new ArrayList<Object>();
		
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
		
		// initiating the loop
		while(it.hasNext() && it2.hasNext()) {
			Object one = it.next();
			Object two = it2.next();
			
			// checks if the two iterators are different, if so
			// adds the differences betweent the arraylists to a new arraylist 
				if (!one.equals(two)) {
				differance.add(one);
				differance.add(two);
				System.out.println(differance);
				System.out.println(differance.getClass());
				System.out.println(differance.size());
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
		

	}

}
