package DoubleSxLink;

public class IntNode {
	private int x;
	IntNode prior = null;
	IntNode next = null;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public IntNode() {
		super();
	}
	public IntNode(int x) {
		super();
		this.x = x;
	}	
}
