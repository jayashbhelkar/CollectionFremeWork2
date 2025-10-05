package collections;

public interface LIFO<E> {

	boolean push(E e) ;
	
	E pop() ;
	
	E peek();
	
	boolean isEmpty() ;
	
	int size() ;
	
	int contains(E e) ;
}
