package SingleSxList;
import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleSxLink objlist = new SingleSxLink();
		Scanner input = new Scanner(System.in);
		String sno = "", sname = "";
		StudNode s = null;
		double score = 0;
		boolean result;
		int i = 0;
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ������ѭ������");
			System.out.println("2 ��ʾ������Ϣ");
			System.out.println("3 ��ѭ������ĳ���");
			System.out.println("4 ȡ��i��Ԫ�صĽ��");
			System.out.println("5 ���ҽ��");
			System.out.println("6 ��ָ��λ��i������һ�����");
			System.out.println("7 �ڵ�ѭ������β׷��һ��Ԫ��");
			System.out.println("8 ɾ����i�����");
			System.out.println("9 �б��Ƿ��");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = input.nextInt();
			switch (choice) {
			case 0:
				input.close();
				System.exit(0);
			case 1:
				objlist.createLinkList();
				break;
			case 2:
				System.out.println(objlist.printList());
				break;
			case 3:
				System.out.println("����ĳ���Ϊ��\t" + objlist.size());
				break;
			case 4:
				System.out.println("������ڵ��i");
				i = input.nextInt();
				if (i == 0) {
					System.out.println("0�Ž����ͷ��㣬����Ϊ�մ�");
				} else {
					s = objlist.indexOf(i);
					if (s == null) {
						System.out.println("δ�ҵ��˽��");
					} else {
						System.out.println("�˽��Ϊ��\t" + s.studentNo + "\t"
								+ s.name + "\t" + s.score);
					}
				}
				break;
			case 5:
				System.out.println("�������������");
				sname = input.next();
				s = objlist.find(sname);
				if (s == null) {
					System.out.println("���޴���");
				} else {
					System.out.println("�˽��Ϊ��\t" + s.studentNo + "\t"
							+ s.name + "\t" + s.score);
				}
				break;
			case 6:
				System.out.println("������ѧ�ţ�");
				sno = input.next();
				System.out.println("������������");
				sname = input.next();
				System.out.println("������ɼ���");
				score = input.nextDouble();
				System.out.println("���������λ�ã�");
				i = input.nextInt();
				s = new StudNode(sno, sname, score);
				result = objlist.insert(i, s);
				if (result) {
					System.out.println("������ɹ�");
				} else {
					System.out.println("������ʧ��");
				}
				break;
			case 7:
				System.out.println("������ѧ�ţ�");
				sno = input.next();
				System.out.println("������������");
				sname = input.next();
				System.out.println("������ɼ���");
				score = input.nextDouble();				
				s = new StudNode(sno, sname, score);
				result = objlist.append(s);
				if (result) {
					System.out.println("���׷�ӳɹ�");
				} else {
					System.out.println("���׷��ʧ��");
				}
				break;
			case 8:
				System.out.println("�������ɾ�ڵ��i");
				i = input.nextInt();
				result=objlist.delete(i);
				if (result) {
					System.out.println("���ɾ���ɹ�");
				} else {
					System.out.println("���ɾ��ʧ��");
				}
				break;
			case 9:				
				result=objlist.isEmpty();
				if(result)
				{
					System.out.println("��ǰ����Ϊ��");
				}
				else
				{
					System.out.println("��ǰ������");
				}
			}
		}
	}

}
