package SeqList;

import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudSeqList objStud = new StudSeqList();
		int choice,i,k;
		String sno,sname,newsname;
		float score;
		Student s = null;
		boolean result;

		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ��ʾ������Ϣ");
			System.out.println("2 ׷�Ӽ�¼");
			System.out.println("3 �����¼");
			System.out.println("4 ��ѯ����");
			System.out.println("5 ��ȡ��i��Ԫ��");
			System.out.println("6 ɾ����i��Ԫ��");			
			System.out.println("7 ������ɾ��Ԫ��");
			System.out.println("8 ���µ�i��Ԫ��");
			System.out.println("9 ����������Ԫ��");			
			System.out.println("10 ��ʾ˳�����");			
			System.out.println("11 �ж��Ƿ�Ϊ��");			
			System.out.println("0 �˳�");
			System.out.println("���������ѡ��");
			choice = input.nextInt();
			switch (choice) {
			case 0:
				input.close();
				System.exit(0);
				break;
			case 1:
				System.out.println(objStud.PrintList());
				break;
			case 2:
				System.out.println("����ѧ��");
				sno = input.next();
				System.out.println("��������");
				sname = input.next();
				System.out.println("�������");
				score = input.nextFloat();
				s = new Student(sno, sname, score);
				result = objStud.Append(s);
				if(result){
					System.out.println("׷�ӳɹ�");
				}else{
					System.out.println("׷��ʧ��");
				}
				break;
			case 3:
				System.out.println("����ѧ��");
				sno = input.next();
				System.out.println("��������");
				sname = input.next();
				System.out.println("�������");
				score = input.nextFloat();
				System.out.println("�������λ��");
				i = input.nextInt();
				s = new Student(sno, sname, score);
				result = objStud.Insert(i, s);
				if(result){
					System.out.println("����ɹ���");
				}else{
					System.out.println("����ʧ�ܣ�");
				}
				break;
			case 4:
				System.out.println("��������");
				sname = input.next();
				k = objStud.Find(sname);
				if(k == -1){
					System.out.println("û�ҵ�");
				}else{
					System.out.println(objStud.studs[k].sno+"\t"+objStud.studs[k].sname+"\t"+objStud.studs[k].score);
				}
				break;
			case 5: 
				System.out.println("�������");
				i = input.nextInt();
				k = objStud.IndexOf(i);
				if(k == -1){
					System.out.println("û�ҵ�");
				}else{
					System.out.println(objStud.studs[k].sno+"\t"+objStud.studs[k].sname+"\t"+objStud.studs[k].score);
				}
				break;
			case 6:
				System.out.println("�����ɾ�����");
				i = input.nextInt();
				result = objStud.DeleteById(i);
				if(result){
					System.out.println("ɾ���ɹ�");
				}else{
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 7:
				System.out.println("�����ɾ�����������");
				sname = input.next();
				result = objStud.DeleteByKey(sname);
				if(result){
					System.out.println("ɾ���ɹ�");
				}else{
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 8:
				System.out.println("������������");
				i = input.nextInt();
				System.out.println("�����µ�ѧ��");
				sno = input.next();
				System.out.println("�����µ�����");
				sname = input.next();
				System.out.println("�����µķ���");
				score = input.nextFloat();
				s = new Student(sno, sname, score);
				result = objStud.UpdateById(i, s);
				if(result){
					System.out.println("���³ɹ�");
				}else{
					System.out.println("����ʧ��");
				}
				break;
			case 9:
				System.out.println("��������¶��������");
				sname = input.next();
				System.out.println("�����µ�ѧ��");
				sno = input.next();
				System.out.println("�����µ�����");
				newsname = input.next();
				System.out.println("�����µķ���");
				score = input.nextFloat();
				s = new Student(sno, newsname, score);
				result = objStud.UpdateByKey(sname, s);
				if(result){
					System.out.println("���³ɹ�");
				}else{
					System.out.println("����ʧ��");
				}
				break;
			case 10:
				System.out.println("Ԫ�ظ���Ϊ��"+objStud.Size());
				break;
			case 11:
				result = objStud.IsEmpty();
				if(result){
					System.out.println("˳���Ϊ��");
				}else{
					System.out.println("˳�����");
				}
				break;
			
			}
		}
	}
}
