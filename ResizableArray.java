package collections;

public interface ResizableArray<E> {
 
	int intialCap = 10 ;
	double loadFactor = 0.75 ;
	
	boolean add(E o) ;
	boolean add(int index, E o) ;
	boolean addAll(ResizableArray<E> ar) ;
	boolean addAll(int index, ResizableArray<E> ar) ;
	boolean remove(E o);
	boolean remove(int index) ;
	boolean removeAll(ResizableArray<E> ar) ;
	boolean retainAll(ResizableArray<E> ar) ;
	void clear() ;
	int size() ;
	boolean contains(E o) ;
	boolean containsAll(ResizableArray<E> ar) ;
	boolean isEmpty() ;
	Object get(int index) ;
	Object[] toArray() ;
	boolean equals(Object o) ;
	int hashCode() ;
	String toString() ;
	
	
}
