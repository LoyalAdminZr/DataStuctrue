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
			System.out.println("\n  *********���������в˵���***********");
			System.out.println("        0������");
			System.out.println("        1�����򴴽�������");
			System.out.println("        2���������������");
			System.out.println("        3���������������");
			System.out.println("        4���������������");
			System.out.println("        5����������ĸ�");
			System.out.println("        6�����������Ҷ����������һ��������");
			System.out.println("        7�����������Ҷ���������������ֿ���ӷ�");
			System.out.println("        8������������ܽ����������һ��������");
			System.out.println("        9������������ܽ���������������ֿ���ӷ�");
			System.out.println("        10����������Ķ�Ϊ1�Ľ����������һ��������");
			System.out.println("        11����������Ķ�Ϊ1�Ľ���������������ֿ���ӷ�");
			System.out.println("        ���������ѡ��");
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
				System.out.println("�������ĸ�Ϊ��" + h);
				break;
			case 6:
				tree.leafcount = 0;
				tree.LeafnumOfBT1(t);
				int leafnum1 = tree.leafcount;
				System.out.println("��������Ҷ����Ϊ��" + leafnum1);
				break;
			case 7:
				int leafnum2 = tree.LeafnumOfBT2(t);
				System.out.println("��������Ҷ����Ϊ��" + leafnum2);
				break;
			case 8:
				tree.nodecount = 0;
				tree.NodenumOfBT1(t);
				System.out.println("���������ܵĽ����Ϊ��" + tree.nodecount);
				break;
			case 9:
				int nodenum = tree.NodenumOfBT2(t);
				System.out.println("���������ܵĽ����Ϊ��" + nodenum);
				break;
			case 10:
				tree.d1nodecount=0;
				tree.Degree1NodeNumOfBT1(t);
				System.out.println("��������Ϊ1�Ľ����Ϊ��" + tree.d1nodecount);
				break;
			case 11:
				int nodenum1 = tree.Degree1NodeNumOfBT2(t);
				System.out.println("��������Ϊ1�Ľ����Ϊ��" + nodenum1);
				break;
			default:
				System.out.println("�������");
				break;
			}
		}
	}
}
