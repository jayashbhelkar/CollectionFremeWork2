package collections;

import java.util.Arrays;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> l = new LinkedList<Integer>() ;
		
		l.add(10) ;
		l.add(110) ;
		l.add(130) ;
		l.add(104) ;
		l.add(105) ;
		

		
		LinkedList<Integer> l2 = new LinkedList<Integer>() ;
		
		l2.add(10) ;
	
	
//		l.addAll(l2) ;
//	//	l.remove(110) ;
//	//	l.removeAll(l2) ;
//		l.retainAll(l2) ;
//		
//		System.out.println(l.size());
//		System.out.println(l.contains(10));
//		
//		System.out.println(l.containsAll(l2));
//		System.out.println(l.isEmpty());
//		System.out.println(Arrays.toString(l.toArray()));
//
		System.out.println(l.equals(l2));
		System.out.println(l.toString());
		
		Iterator<Integer> e = l.iterate() ;
		
		while (e.hasNext()) {
			Integer ele = e.next() ;
			
			if (ele%2==0) {
				
				l.remove(ele) ;
			}
			
		}
		
		System.out.println(l);
		
	
	}
}
