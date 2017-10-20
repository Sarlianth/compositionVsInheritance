package ie.gmit.sw;
import java.util.*;

public class CompStack<E> implements Stackable<E>{

	private List<E> list = null;
	
	
	public CompStack() {
		double rand = Math.random();
		
		if(rand>0.7d){
			list = new Vector<E>();
		}
		else if (rand>0.4d){
			list = new LinkedList<E>();
		}
		else{
			list = new ArrayList<E>();
		}
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackable#push(E)
	 */
	@Override
	public void push(E element){
		list.add(element);
	}
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackable#peek()
	 */
	@Override
	public E peek(){
		return list.get(list.size() - 1);
	}
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackable#pop()
	 */
	@Override
	public E pop(){
		E temp = peek();
		list.remove(list.size()-1);
		return temp;
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackable#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackable#size()
	 */
	@Override
	public int size() {
		return list.size();
	}
	
	
	
}
