package collections;

public class Iterator<E> {

	
	Node<E> currRef ;
	Node<E> ref ;
	Node<E> preRef ;
	
	LinkedList<E> listRef ;
	
	
	int ct ;
	public Iterator(Node<E> head, LinkedList<E> ref,int size) {
		
		currRef = head ;
		
		this.listRef = ref ;
		
		ct = size ;
	}
	
	public E next()
	{
		ct++ ;
		E val = currRef.val ;
		preRef = currRef;
		
		
		currRef = currRef.next ;
		return val ;
	}
	
	public E previous() 
	{
		ct-- ;
		E val = currRef.val ;
		preRef = currRef ;
		currRef = currRef.prev ;
		
		return val ;
	}
	
	public boolean hasNext()
	{
		return ct< listRef.size();
	}
	
	public boolean hasPrevious()
	{
		return ct>=0 ;
	}
	
	public Node<E> nextRef()
	{
		return currRef.next ;
	}
	
	public Node<E> prevRef()
	{
		return currRef.prev ;
	}
}
