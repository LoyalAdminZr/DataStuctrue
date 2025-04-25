package HafumanBitree;

public class HTreeNode  implements Comparable<HTreeNode>{
	int value;// 节点权值
	HTreeNode lchild;// 左子树地址
	HTreeNode rchild;//右子树地址
	
	public HTreeNode(int value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(HTreeNode arg0) {
		return this.value - arg0.value;
	}
	
}
