package ie.gmit.Adapter;

//This is a decorator!
public class EncryptedSingleStringWriter extends SimpleStringWriter{

	private SimpleStringWriter ssw;
	private int key = Short.MAX_VALUE - 7; // The 7 should be hidden...
	
	public EncryptedSingleStringWriter(SimpleStringWriter ssw) {
		super();
		this.ssw = ssw;
	}

	public void write(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			int d = c ^ key;
			sb.append((char) d);
		}
		
		super.write(sb.toString());
	}
	
	
	
}
