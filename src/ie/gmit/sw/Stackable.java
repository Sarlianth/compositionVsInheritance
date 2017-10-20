package ie.gmit.sw;

public interface Stackable<E> {

	void push(E element);

	E peek();

	E pop();

	boolean isEmpty();

	int size();

}