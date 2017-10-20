package ie.gmit.sw;

import java.util.*;

public class InheritStack<E> extends ArrayList<E> implements Stackable<E>{

	private static final long serialVersionUID = 777L;
	
	public void push(E element){
		super.add(element);
	}
	
	public E peek(){
		return super.get(super.size() - 1);
	}
	
	public E pop(){
		E temp = peek();
		super.remove(super.size()-1);
		return temp;
	}
	
	
}
