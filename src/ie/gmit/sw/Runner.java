package ie.gmit.sw;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		//Composition is better to use over inheritance

		Stackable<String> stack = new InheritStack<String>();
		for (int i=0; i<100; i++){
			stack.push("Element-" + i);
		}
		
		System.out.println("Size: " + stack.size());
		System.out.println("Top: " + stack.peek());
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		ArrayList<String> arr = (ArrayList<String>) stack;
		
		
		System.out.println("Size: " + stack.size());
	}

}
