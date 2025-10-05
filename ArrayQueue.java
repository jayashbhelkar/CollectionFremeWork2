package collections;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>{

	private Object[] ar ;
	
	int cap = Queue.initialCap ;
	
	int ct = 0 ;
	public ArrayQueue() {
		
		ar = new Object[Queue.initialCap] ;
	}
	
	ArrayQueue(int cap)
	{
		if (cap>=0) {
			
			this.cap = cap ;
			
			ar = new Object[cap] ;
		}
		else
		{
			throw new WrongInitialCapacity("A Queue cannot be negative sized") ;
		}
	}
	
	ArrayQueue(Queue<E> ref)
	{
		
	}
	
	@Override
	public boolean add(E ele) {
		
		if (ele !=null) {
			
			if (ct < ar.length*0.75) {
				
				ar[ct] = ele ;
				ct++ ;
				
				return true ;
			}
			else
			{
				Object [] temp = new Object[ar.length*2] ;
				
				for (int i = 0; i < ct; i++) {
					
					temp[i] = ar[i] ;
				}
				
				ar = temp ;
				
				ar[ct] = ele ;
				ct++ ;
				
				return false ;
			}
			
		
		}
		return false ;
	}
	
	@Override
	public E element() {
		
		if (ar[0]!=null) {
			
			return (E)ar[0] ;
		}
		
		return null ;
	}
	
	@Override
	public boolean offer(E ele) {
	
		return add(ele) ;
	}
	
	@Override
	public E peek() {
		
		return element();
	}
	
	@Override
	public E remove() {
		
		E val = (E)ar[0] ;
		
		if (val!=null) {
			
			for (int i = 1; i < ct; i++) {
				
				ar[i-1] = ar[i] ;
			}
			
			ct-- ;
			return val ;
		}
		
		return val ;
	}
	
	@Override
	public E poll() {
		return remove() ;
	}
	
	@Override
	public boolean isEmpty() {
		return ct==0;
	}
	
	@Override
	public int size() {
		return ct;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		ArrayQueue<E> ref = (ArrayQueue<E>) obj ;
		
		for (int i = 0; i < ct; i++) {
			
			if (this.ar[i]!=ref.ar[i]) {
				
				return false ;
			}
		}
		
		return true ;
	}
	
	
	public String toString()
	{
		String ans = "[" ;
		
		for (int i = 0; i < ct; i++) {
			
			ans = ans + ar[i]+", " ;
		}
		
		ans = ans + "]" ;
		
		return ans ;
	}
	
	public boolean contains(E ele)
	{
		for (int i = 0; i < ct; i++) {
			
			if (ele.equals(ar[i])) {
				
				return true ;
			}
		}
		
		return false ;
	}
	
	@Override
	public boolean makeNextHead(E ele) {
		
		if (ele!=null) {
			
			int index = indexOf(ele) ;
			
			if (index==1) {
				
				return true ;
			}
			else
			{
				int i = index==-1 ? ct : index ;
				
				for (; i>1; i--) {
					
					ar[i] = ar[i-1] ;
				}
				
				ar[1] = ele ;
				
				
				ct = index==-1 ? ct+1 :ct ;
				
				return true ;
			}
				
		}
		
		return false ;
	}
	
	@Override
	public void shuffle() {
		
		for (int i = ct-1; i>0;) {
			
			int j = (int)(Math.random()*(i+1)) ;
			
			if (j!=0) {
				
				Object temp = ar[i] ;
				ar[i] = ar[j] ;
				ar[j] = temp ;
				
				i-- ;
			}
		}
		
	}
	
	
	private int indexOf(E e)
	{
		for (int i = 0; i < ct; i++) {
			
			if (ar[i].equals(e)) {
				
				return i ;
			}
			
		}
		
		return -1 ;
	}
	
	
	
	
	
	
}
