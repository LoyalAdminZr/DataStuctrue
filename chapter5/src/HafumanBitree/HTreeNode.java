package HafumanBitree;

public class HTreeNode  implements Comparable<HTreeNode>{
	int value;// �ڵ�Ȩֵ
	HTreeNode lchild;// ��������ַ
	HTreeNode rchild;//��������ַ
	
	public HTreeNode(int value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(HTreeNode arg0) {
		return this.value - arg0.value;
	}
	
}
