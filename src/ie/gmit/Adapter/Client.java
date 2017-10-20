package ie.gmit.Adapter;

public class Client {

	public static void main(String[] args){
		
		String[] names = {"John", "Paul", "Mary", "Anne", "Alan", "Barbara"};
		ListWriterable writer = new CompArrayStringWriter(true); //We do not have a conforming class yet
		writer.open("stuff.txt");
		writer.write(names);
		writer.close();
	}

}
