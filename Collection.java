package collections;

public interface Collection<E>{


	boolean add(E o) ;
	boolean addAll(Collection<E> ar) ;
	boolean remove(E o);
	boolean removeAll(Collection<E> ar) ;
	boolean retainAll(Collection<E> ar) ;
	void clear() ;
	int size() ;
	boolean contains(E o) ;
	boolean containsAll(Collection<E> ar) ;
	boolean isEmpty() ;
	Object[] toArray() ;
	boolean equals(Object o) ;
	//int hashCode() ;
	String toString() ;
	Iterator<E> iterate() ;
	Iterator<E> reverseIterate() ;
}
