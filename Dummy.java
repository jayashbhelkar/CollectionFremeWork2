package collections;

import java.util.LinkedList;

public class Dummy {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> l = new LinkedList<Integer>() ;
		
		l.add(43) ;
		l.add(143) ;
		l.add(443) ;
		l.add(443) ;
		l.add(130) ;
		l.add(104) ;
		l.add(105) ;
		l.add(130) ;
		
		
		LinkedList<Integer> l2 = new LinkedList<Integer>() ;
		
		l2.add(10) ;
		l2.add(110) ;
		l2.add(130) ;
		l2.add(104) ;
		l2.add(105) ;
		
	java.util.Iterator<Integer> e = l.iterator() ;
		
		while (e.hasNext()) {
			Integer ele = e.next() ;
			
			if (ele%2==0) {
				
				e.remove() ;
			}
			
		}
		
		System.out.println(l);
	}
}
