package collections;

public class HashSetDriver {

	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(16) ;
		hs.add(0) ;
		hs.add(1) ;
		hs.add(2) ;
		hs.add(3) ;
		hs.add(4) ;
		hs.add(5) ;
		hs.add(6) ;
		hs.add(7) ;
		hs.add(8) ;
		hs.add(9) ;
		hs.add(10) ;
		hs.add(11) ;
		hs.add(12) ;
		hs.add(16) ;
		System.out.println(hs.initialCap);
		
		System.out.println(hs);
		
		HashSet<Integer> hs2 = new HashSet<Integer>() ;
		
		hs2.add(2) ;
		hs2.add(12) ;
		hs2.add(3) ;
		hs2.add(13) ;
		hs2.add(16) ;
		
		hs.removeAll(hs2) ;
		
		System.out.println(hs);
	}

}
