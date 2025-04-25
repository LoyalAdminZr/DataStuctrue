package LinkStack;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args){
		StudNodeLinkStack studsStack = new StudNodeLinkStack();
		Scanner input =new Scanner(System.in);
		String sno = "", sname = "";
		StudNode s = null;
		double score = 0;
		boolean result;
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ѧ����Ϣ��ջ");
			System.out.println("2 ��ʾջ��Ԫ��");
			System.out.println("3 ѧ����Ϣ��ջ");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = input.nextInt();
			switch (choice) {
			case 0:
				input.close();
				System.exit(0);
			case 1:
				System.out.println("������ѧ�ţ�");
				sno = input.next();
				System.out.println("������������");
				sname = input.next();
				System.out.println("������ɼ���");
				score = input.nextDouble();
				s = new StudNode(sno, sname, score);
				result = studsStack.push(s);
				if (result) {
					System.out.println("��ջ�ɹ�");
				} else {
					System.out.println("��ջʧ��,ջ�������������");
				}
				break;
			case 2:
				s = studsStack.getTop();
				if(s==null){
					System.out.println("ջΪ��");
				}else{
					System.out.println(s.studentNo+" "+s.name+" "+s.score);
				}
				break;
			case 3:
				s = studsStack.getTop();
				result = studsStack.pop();
				if (result) {
					System.out.println("��ջ�ɹ�");
				} else {
					System.out.println("��ջʧ��");
				}
				break;
			default:
				System.out.println("ѡ���������ѡ");
				break;
			}
		}
	}
}
