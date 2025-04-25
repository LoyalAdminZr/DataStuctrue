package DoubleSxLink;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SxIntLink objSxLink = new SxIntLink();
		int choice = 0, k ,x;
		IntNode s = null;
		boolean result; 

		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ����˫ѭ������");
			System.out.println("2 ��ʾ������Ϣ");
			System.out.println("3 ��˫ѭ������ĳ���");
			System.out.println("4 ȡ��i��Ԫ�صĽ��");
			System.out.println("5 ���ҽ��");
			System.out.println("6 ��ָ��λ��i������һ�����");
			System.out.println("7 ������β׷��һ��Ԫ��");
			System.out.println("8 ɾ����i�����");
			System.out.println("9 �б��Ƿ��");
			System.out.println("0 �˳�");
			System.out.println("���������ѡ��");
			choice = input.nextInt();
			switch (choice) {
			case 0:
				input.close();
				System.exit(0);
				break;
			case 1:
				objSxLink.createSxLink();
				break;
			case 2:
				System.out.println(objSxLink.printList());
				break;
			case 3:
				int length = objSxLink.size();
				System.out.println("����ĳ���Ϊ��\t" + length);
				break;
			case 4:
				System.out.println("������������");
				k = input.nextInt();
				s = objSxLink.indexOf(k);
				if (s == null) {
					System.out.println("û�ҵ�");
				} else {
					System.out.println(s.getX());
				}
				break;
			case 5:
				System.out.println("�����������");
				x = input.nextInt();
				s = objSxLink.find(x);
				if (s == null) {
					System.out.println("û�ҵ�");
				} else {
					System.out.println(s.getX());
				}
				break;
			case 6:
				System.out.println("��������ֵ��");
				x = input.nextInt();
				System.out.println("���������λ�ã�");
				k = input.nextInt();
				s = new IntNode(x);
				result = objSxLink.insert(k, s);
				if (result) {
					System.out.println("������ɹ�");
				} else {
					System.out.println("������ʧ��");
				}
				break;
			case 7:
				System.out.println("��������ֵ��");
				x = input.nextInt();
				s = new IntNode(x);
				result = objSxLink.append(s);
				if (result) {
					System.out.println("׷�ӳɹ�");
				} else {
					System.out.println("׷��ʧ��");
				}
				break;
			case 8:
				System.out.println("�����ɾ�����");
				k = input.nextInt();
				result = objSxLink.delete(k);
				if (result) {
					System.out.println("ɾ���ɹ�");
				} else {
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 9:
				result = objSxLink.isEmpty();
				if (result) {
					System.out.println("����Ϊ��");
				} else {
					System.out.println("������");
				}
				break;
			}
		}
	}
}
