package BiTreePackage;

public interface IBiTree {
	public BiTreeNode CreateBiTree() ;
	public void preOrder(BiTreeNode t);
	public void inOrder(BiTreeNode t);
	public void postOrder(BiTreeNode t);
	public int treeHeight(BiTreeNode t);
}
