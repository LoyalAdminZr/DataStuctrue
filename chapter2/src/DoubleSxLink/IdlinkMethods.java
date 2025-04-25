package DoubleSxLink;

public interface IdlinkMethods {
	public void createSxLink();
	public int size();
	public IntNode indexOf(int i);
	public IntNode find(int x);
	public boolean insert(int i,IntNode s);
	public boolean append(IntNode s);
	public boolean delete(int i);
	public boolean isEmpty();
	public String printList();
}
