package ie.gmit.Adapter;

// class adapter
public class ArrayStringWriter extends SimpleStringWriter implements ListWriterable{

	public void write(String[] list) {
		for(String s : list){
			super.write(s);
		}
	}
	

}
