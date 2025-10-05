package collections;

public class HashSet<E> {

	int count = 0 ;
	
	int initialCap = 16 ;
	
	double loadFact  = 0.75 ;
	
	
	LinkedList<E> [] hs ;
	
	public HashSet() {
		
		hs = new  LinkedList[initialCap] ;
		
		
	}
	
	public HashSet(int initalCap)
	{
		hs = new  LinkedList[initialCap] ;
	}
	
	public boolean add(E val)
	{
		int h = hash(val) ;
		int cap = 16 ;
		
		
		for (int i =1; i*cap <=initialCap ; i*=2) {
			
			if (hs[(val.hashCode())%(cap*i)]!=null && 
					hs[(val.hashCode())%(cap*i)].contains(val)) {
				
				return false ;
			}
		}
		
			
			if (val!=null && count<loadFact*hs.length) {
				
				if (val!=null) {
					
					int index = hash(val) ;
					
					if (hs[index]==null) {
						
						hs[index] = new LinkedList<E>() ;
						
						hs[index].add(val) ;
						count++ ;
					}
					else
					{

						if (!(hs[index].contains(val))) {
							
							hs[index].add(val) ;
						}
						
					}
					
					return true ;
				}
				
			}
			else
			{
				initialCap*=2 ;
				LinkedList<E>[] temp = new LinkedList[initialCap] ;
				
				for (int i = 0; i < hs.length; i++) {
					
					temp[i] = hs[i] ;
				}
				
				hs = temp ;
				
				if (val!=null) {
					
					int index = hash(val) ;
					
					if (hs[index]==null) {
						
						hs[index] = new LinkedList<E>() ;
						
						hs[index].add(val) ;
						count++ ;
					}
					else
					{
						if (!(hs[index].contains(val))) {
							
							hs[index].add(val) ;
						}
						
					}
					
					return true ;
			}
			
			
			}
			
			return false ;
			
		
	}
	public int hash(E val)
	{
		if (val!=null) {
			
			int valHashCode = val.hashCode() ;
			
			return valHashCode% hs.length ;
		}
		
		throw new NullPointerException("This HashSet Doesnt allow Nulls") ;
	}
	
	public String toString() {
		
		String s = "[ " ;
		
		for (int i = 0; i < hs.length; i++) {
			
			
			if (hs[i]!=null) {
				
				s = s + hs[i].toString() ;
			}
		}
		
		s +=" ]" ;
		
		return s ;
	}
	
	public boolean contains(E val)
	{
		int index = hash(val) ;
		
		if (hs[index]!=null) {
			
			return hs[index].contains(val) ;
		}
		
		return false ;
	}
	
	public boolean remove(E val)
	{

		int cap = 16 ;
		
		
		for (int i =1; i*cap <=initialCap ; i*=2) {
			
			if (hs[(val.hashCode())%(cap*i)]!=null &&
					hs[(val.hashCode())%(cap*i)].contains(val)) {
				
				int index = (val.hashCode())%(cap*i) ;
				
				if (hs[index]!=null) {
					
					if (hs[index].remove(val) && hs[index].size()==0) {
						
						
						hs[index] = null ;
						
						count-- ;
						
					}
					
					return true ;
				}
			}
		}
		
		
		return false ;
	}
	
	
	public boolean addAll(HashSet<E> hs2)
	{
		if (hs2!=null) {
			
			for (int i = 0; i < hs2.hs.length; i++) {
				
				if (hs2.hs[i]!=null) {
					
					Iterator<E> itr = hs2.hs[i].iterate() ;
					
					while (itr.hasNext()) {
						
						add(itr.next()) ;
					}
				}
			}
			
			return true ;
		}
		
		return false ;
	}
	public boolean removeAll(HashSet<E> hs2)
	{
		if (hs2!=null) {
			
			for (int i = 0; i < hs2.hs.length; i++) {
				
				if (hs2.hs[i]!=null) {
					
					Iterator<E> itr = hs2.hs[i].iterate() ;
					
					while (itr.hasNext()) {
						
						remove(itr.next()) ;
					}
				}
			}
			
			return true ;
		}
		
		return false ;
	}
	
	
	
	
	
	
	

	
}
