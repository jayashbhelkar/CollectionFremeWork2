package collections;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1000) ;
		hs.add(1026) ;
		hs.add(10) ;
		hs.add(26) ;
		hs.add(126) ;
		hs.add(236) ;
		hs.add(246) ;
		hs.add(265) ;
		hs.add(26456) ;
		hs.add(2634565) ;
		
		//System.out.println(hs);
		Integer h = 100 ;
		System.out.println(h.hashCode() ^ h>>>16);
	}
}
