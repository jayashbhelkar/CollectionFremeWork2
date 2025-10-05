package collections;

public class Stack<E> implements LIFO<E>{

	
	ArrayList<E> list = new ArrayList<E>() ;
	
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean push(E e) {
		
		return list.add(e) ;
	}
	
	@Override
	public E pop() {
		
		E ele = list.get(list.size()-1) ;
		 list.remove(list.size()-1) ;
		 return ele ;
	}
	
	@Override
	public boolean isEmpty() {
		
		return list.isEmpty() ;
	}
	
	@Override
	public int contains(E e) {
		
		int index = list.indexOf(e) ;
		if (index==-1) {
			
			return index; 
		}
		
		return list.size()-index ;
	}
	
	@Override
	public E peek() {
		
		if (!list.isEmpty()) {
			
			return list.get(list.size()-1) ;
		}
		
		return null ;
	}
	
	@Override
	public int size() {
		
		return list.size() ;
	}
	
}
