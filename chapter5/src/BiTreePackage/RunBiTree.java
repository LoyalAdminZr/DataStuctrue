package BiTreePackage;

import java.util.Scanner;

public class RunBiTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BiTreeNode t = null;
		BiTree tree = new BiTree();
		while (true) {
			System.out.println("\n  *********二叉树运行菜单项***********");
			System.out.println("        0：结束");
			System.out.println("        1：先序创建二叉树");
			System.out.println("        2：先序遍历二叉树");
			System.out.println("        3：中序遍历二叉树");
			System.out.println("        4：后序遍历二叉树");
			System.out.println("        5：求二叉树的高");
			System.out.println("        6：求二叉树的叶子数，方法一，变量法");
			System.out.println("        7：求二叉树的叶子数，方法二，分块相加法");
			System.out.println("        8：求二叉树的总结点数，方法一，变量法");
			System.out.println("        9：求二叉树的总结点数，方法二，分块相加法");
			System.out.println("        10：求二叉树的度为1的结点数，方法一，变量法");
			System.out.println("        11：求二叉树的度为1的结点数，方法二，分块相加法");
			System.out.println("        请输入你的选择：");
			int choice;
			Scanner read = new Scanner(System.in);
			choice = read.nextInt();
			switch (choice) {
			case 0:
				read.close();
				System.exit(0);
				break;
			case 1:
				t = tree.CreateBiTree();
				break;
			case 2:
				tree.preOrder(t);
				break;
			case 3:
				tree.inOrder(t);
				break;
			case 4:
				tree.postOrder(t);
				break;
			case 5:
				int h = tree.treeHeight(t);
				System.out.println("二叉树的高为：" + h);
				break;
			case 6:
				tree.leafcount = 0;
				tree.LeafnumOfBT1(t);
				int leafnum1 = tree.leafcount;
				System.out.println("二叉树的叶子数为：" + leafnum1);
				break;
			case 7:
				int leafnum2 = tree.LeafnumOfBT2(t);
				System.out.println("二叉树的叶子数为：" + leafnum2);
				break;
			case 8:
				tree.nodecount = 0;
				tree.NodenumOfBT1(t);
				System.out.println("二叉树的总的结点数为：" + tree.nodecount);
				break;
			case 9:
				int nodenum = tree.NodenumOfBT2(t);
				System.out.println("二叉树的总的结点数为：" + nodenum);
				break;
			case 10:
				tree.d1nodecount=0;
				tree.Degree1NodeNumOfBT1(t);
				System.out.println("二叉树度为1的结点数为：" + tree.d1nodecount);
				break;
			case 11:
				int nodenum1 = tree.Degree1NodeNumOfBT2(t);
				System.out.println("二叉树度为1的结点数为：" + nodenum1);
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		}
	}
}
