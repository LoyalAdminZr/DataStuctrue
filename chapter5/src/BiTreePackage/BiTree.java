package BiTreePackage;

import java.util.Scanner;

public class BiTree implements IBiTree{
	public int leafcount = 0;
	public int nodecount = 0;
	public int d1nodecount = 0;
	Scanner read = new Scanner(System.in);

	/**
	 * 用先根序创建二叉树，注意，要把所有叶子结点的左右孩子读为0才能结束。
	 */
	@Override
	public BiTreeNode CreateBiTree() {
		BiTreeNode t = null;
		System.out.println("先序输入二叉树各结点，以回车结束，把各结点的空孩子补为0以便结束");
		String data = read.next();
		if (!data.equals("0")) {
			t = new BiTreeNode(data); // 创建根结点
			t.lchild =  CreateBiTree();  //创建根结点的左子树
			t.rchild =  CreateBiTree();  //创建根结点的右子树
		}
		return t;
	}

	/**
	 * 先序遍历二叉树
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
	 * 中序遍历二叉树
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
	 * 后序遍历二叉树
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
	 * 求二叉树的高度
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
	 * 求二叉树叶子结点数，方法一，变量法
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
	 * 求二叉树叶子结点数，方法二，分块相加法
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
	 * 求二叉树总结点数，方法一，变量法
	 */
	public void NodenumOfBT1(BiTreeNode t) {
		if (t != null) {
			nodecount++;
			NodenumOfBT1(t.lchild);
			NodenumOfBT1(t.rchild);
		}
	}
	
	/**
	 * 求二叉树总结点数，方法二，分块相加法
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
	 * 求二叉树度为1的结点数，方法一，变量法
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
	 * 求二叉树度为1的结点数，方法二，分块相加法
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
