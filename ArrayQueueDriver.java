package collections;

public class ArrayQueueDriver {

	public static void main(String[] args) {
		
		
		ArrayQueue<Integer> aq = new ArrayQueue<Integer>() ;
		
		aq.add(10) ;
		aq.add(20) ;
		aq.add(30) ;
		
		ArrayQueue<Integer> aq2 = new ArrayQueue<Integer>() ;
		aq2.add(10) ;
		aq2.add(20) ;
		aq2.add(30) ;
	
		
		
		System.out.println(aq);
		System.out.println(aq2);
		
		
		
		System.out.println(aq.equals(aq2));
	}
}
