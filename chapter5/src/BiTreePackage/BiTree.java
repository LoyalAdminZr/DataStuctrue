package BiTreePackage;

import java.util.Scanner;

public class BiTree implements IBiTree{
	public int leafcount = 0;
	public int nodecount = 0;
	public int d1nodecount = 0;
	Scanner read = new Scanner(System.in);

	/**
	 * ���ȸ��򴴽���������ע�⣬Ҫ������Ҷ�ӽ������Һ��Ӷ�Ϊ0���ܽ�����
	 */
	@Override
	public BiTreeNode CreateBiTree() {
		BiTreeNode t = null;
		System.out.println("�����������������㣬�Իس��������Ѹ����Ŀպ��Ӳ�Ϊ0�Ա����");
		String data = read.next();
		if (!data.equals("0")) {
			t = new BiTreeNode(data); // ���������
			t.lchild =  CreateBiTree();  //����������������
			t.rchild =  CreateBiTree();  //����������������
		}
		return t;
	}

	/**
	 * �������������
	 */
	@Override
	public void preOrder(BiTreeNode t) {
		if (t != null) {
			System.out.print(t.data);
			preOrder(t.lchild);
			preOrder(t.rchild);
		}
	}

	/**
	 * �������������
	 */
	@Override
	public void inOrder(BiTreeNode t) {
		if (t != null) {
			inOrder(t.lchild);
			System.out.print(t.data);
			inOrder(t.rchild);
		}
	}

	/**
	 * �������������
	 */
	@Override
	public void postOrder(BiTreeNode t) {
		if (t != null) {
			postOrder(t.lchild);
			postOrder(t.rchild);
			System.out.print(t.data);
		}
	}

	/**
	 * ��������ĸ߶�
	 */
	public int treeHeight(BiTreeNode t) {
		if (t == null) {
			return 0;
		} else {
			int lh = treeHeight(t.lchild);
			int rh = treeHeight(t.rchild);
			return (lh > rh) ? lh + 1 : rh + 1;
		}
	}

	/**
	 * �������Ҷ�ӽ����������һ��������
	 */
	public void LeafnumOfBT1(BiTreeNode t) {
		if (t != null) {
			if (t.lchild == null && t.rchild == null)
				leafcount++;
			LeafnumOfBT1(t.lchild);
			LeafnumOfBT1(t.rchild);
		}
	}

	/**
	 * �������Ҷ�ӽ���������������ֿ���ӷ�
	 */
	public int LeafnumOfBT2(BiTreeNode t) {
		if (t == null) {
			return 0;
		}else{
			int lleaf = LeafnumOfBT2(t.lchild);
			int rleaf = LeafnumOfBT2(t.rchild);
			if (t.lchild == null && t.rchild == null) {
				return lleaf + rleaf + 1;
			} else {
				return lleaf + rleaf;
			}
		}
	}

	/**
	 * ��������ܽ����������һ��������
	 */
	public void NodenumOfBT1(BiTreeNode t) {
		if (t != null) {
			nodecount++;
			NodenumOfBT1(t.lchild);
			NodenumOfBT1(t.rchild);
		}
	}
	
	/**
	 * ��������ܽ���������������ֿ���ӷ�
	 */
	public int NodenumOfBT2(BiTreeNode t) {
		if (t == null) {
			return 0;
		} else {
			int ln = NodenumOfBT2(t.lchild);
			int rn = NodenumOfBT2(t.rchild);
			return ln + rn + 1;
		}
	}

	/**
	 * ���������Ϊ1�Ľ����������һ��������
	 */
	public void Degree1NodeNumOfBT1(BiTreeNode t) {
		if (t != null) {			
			if (t.lchild != null && t.rchild == null || t.lchild == null
					&& t.rchild != null) {
				d1nodecount++;
			}
			Degree1NodeNumOfBT1(t.lchild);
			Degree1NodeNumOfBT1(t.rchild);
		}
	}

	/**
	 * ���������Ϊ1�Ľ���������������ֿ���ӷ�
	 */
	public int Degree1NodeNumOfBT2(BiTreeNode t) {
		if (t == null) {
			return 0;
		} else {
			int ln = Degree1NodeNumOfBT2(t.lchild);
			int rn = Degree1NodeNumOfBT2(t.rchild);
			if (t.lchild != null && t.rchild == null || t.lchild == null
					&& t.rchild != null) {
				return ln + rn + 1;
			} else {
				return ln + rn;
			}
		}
	}

}
