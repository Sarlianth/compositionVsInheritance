package ie.gmit.Adapter;

public class CompArrayStringWriter implements ListWriterable {
	private SimpleStringWriter ssw = null;
	
	public CompArrayStringWriter(boolean paranoid){
		if(paranoid){
			ssw = new EncryptedSingleStringWriter(new SimpleStringWriter());
		}else{
			ssw = new SimpleStringWriter();
		}
	}

	public void write(String[] list) {
		for (String s : list) {
			ssw.write(s);
		}
	}

	public void open(String fileName) {
		ssw.open(fileName);
	}

	public void close() {
		ssw.close();
	}

}