package HafumanBitree;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 13, 7, 8, 3, 29, 6, 1 };
		HafumanTree hfmtree = new HafumanTree();
		HTreeNode t = hfmtree.create(arr);
		hfmtree.PreOrder(t);
	}
}
