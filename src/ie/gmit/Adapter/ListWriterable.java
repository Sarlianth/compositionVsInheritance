package ie.gmit.Adapter;

public interface ListWriterable {
	public void open(String filaName);
	public void write(String[] list);
	public void close();
}
