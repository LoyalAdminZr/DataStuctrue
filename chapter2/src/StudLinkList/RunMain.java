package StudLinkList;

import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice,i;
		boolean result;
		String sno,sname,newsname;
		float score;
		Student s = null;
		StudLinkList objStud = new StudLinkList();
		
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ����������");
			System.out.println("2 ��ʾ������Ϣ");
			System.out.println("3 ������ĳ���");
			System.out.println("4 ȡ��i��Ԫ�صĽ��");
			System.out.println("5 ���ҽ��");
			System.out.println("6 ��ָ��λ��i������һ�����");
			System.out.println("7 ������β׷��һ��Ԫ��");
			System.out.println("8 ɾ����i�����");
			System.out.println("9 ���ؼ���ɾ�����");
			System.out.println("10 ���µ�i�����");
			System.out.println("11 ���ؼ��ָ��½��");
			System.out.println("9 �б��Ƿ��");
			System.out.println("0 �˳�");
			System.out.println("���������ѡ��");
			choice = input.nextInt();
			switch(choice) {
			case 0:
				input.close();
				System.exit(0);
				break;
			case 1:
				objStud.createLinkList();
				break;
			case 2:
				System.out.println(objStud.printList());
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("��������ҵ����");
				i = input.nextInt();
				s = objStud.indexOf(i);
				if(s == null) {
					System.out.println("û�ҵ�");
				}else {
					System.out.println(s.sno+"\t"+s.sname+"\t"+s.score+"\n");
				}
				break;
			case 5:
				System.out.println("��������ҵ�����");
				sname = input.next();
				s = objStud.find(sname);
				if(s == null) {
					System.out.println("û�ҵ�");
				}else {
					System.out.println(s.sno+"\t"+s.sname+"\t"+s.score+"\n");
				}
				break;
			case 6:
				System.out.println("����ѧ��");
				sno = input.next();
				System.out.println("��������");
				sname = input.next();
				System.out.println("�������");
				score = input.nextFloat();
				s = new Student(sno, sname, score);
				System.out.println("�������λ��");
				i = input.nextInt();
				result = objStud.insert(i, s);
				if(result) {
					System.out.println("����ɹ�");
				}else {
					System.out.println("����ʧ��");
				}
				break;
			case 7:
				System.out.println("����ѧ��");
				sno = input.next();
				System.out.println("��������");
				sname = input.next();
				System.out.println("�������");
				score = input.nextFloat();
				s = new Student(sno, sname, score);
				result = objStud.append(s);
				if(result) {
					System.out.println("׷�ӳɹ�");
				}else {
					System.out.println("׷��ʧ��");
				}
				break;
			case 8:
				System.out.println("�����ɾ�����");
				i = input.nextInt();
				result = objStud.deleteById(i);
				if(result) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 9:
				System.out.println("��������");
				sname = input.next();
				result = objStud.deleteByKey(sname);
				if(result) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 10:
				System.out.println("������������");
				i = input.nextInt();
				System.out.println("������ѧ��");
				sno = input.next();
				System.out.println("����������");
				sname = input.next();
				System.out.println("�����·���");
				score = input.nextFloat();
				s = new Student(sno, sname, score);
				result = objStud.updateById(i, s);
				if(result) {
					System.out.println("���³ɹ�");
				}else {
					System.out.println("����ʧ��");
				}
				break;
			case 11:
				System.out.println("�������������");
				sname = input.next();
				System.out.println("������ѧ��");
				sno = input.next();
				System.out.println("����������");
				newsname = input.next();
				System.out.println("�����·���");
				score = input.nextFloat();
				s = new Student(sno, newsname, score);
				result = objStud.updateByKey(sname, s);
				if(result) {
					System.out.println("���³ɹ�");
				}else {
					System.out.println("����ʧ��");
				}
				break;				
			}
		}
	}
}
