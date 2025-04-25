package StudLinkList;

import java.util.Scanner;

public class StudLinkList implements ILinkList {
	// ������ľ���ʵ���� = ���� + ���캯�� + ����
	Student head = null; // '\0' 65=> 'A'
	// head�Ƕ������������Ͼ���ָ�룬��JAVA�гƶ��������

	public StudLinkList() {
		super();
		// ���캯�������캯����������ʼ���ģ������Ǵ���һ���յ�����������һ��ͷ���
		head = new Student(); // C��������malloc(sizeof(float))����ռ�
		head.next = null;
	}

	@Override
	public int size() {
		Student p = head.next;
		int len = 0;
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}

	@Override
	public boolean isEmpty() {
		return head.next == null ? true : false;
	}

	@Override
	public String printList() {
		Student p = head.next;
		StringBuilder sb = new StringBuilder();
		int i = 1;
		sb.append("���" + "\t" + "ѧ��" + "\t" + "����" + "\t" + "����" + "\n");
		while (p != null) {
			sb.append(i + "\t" + p.sno + "\t" + p.sname + "\t" + p.score + "\n");
			p = p.next;
			i++;
		}
		return sb.toString();
	}

	@Override
	public void createLinkList() {		
		 // ��β�巨���� 
		Student p=head , s =null; 
		String sno,sname,todo = "y"; 
		float score;
		Scanner input = new Scanner(System.in); 
		while(todo.toLowerCase().equals("y")){ 
			System.out.println("����ѧ��"); 
			sno = input.next(); 
			System.out.println("��������");
			sname = input.next(); 
			System.out.println("�������"); 
			score = input.nextFloat();
			s = new Student(sno,sname,score);
			p.next = s; 
			p = p.next;
			System.out.println("�Ƿ��������(y/n):"); 
			todo = input.next(); 
		}
		 
		 /*
		// ��ͷ�巨����������
		Student s = null;
		String sno, sname, todo = "y";
		float score;
		Scanner input = new Scanner(System.in);
		while (todo.toLowerCase().equals("y")) {
			System.out.println("����ѧ��");
			sno = input.next();
			System.out.println("��������");
			sname = input.next();
			System.out.println("�������");
			score = input.nextFloat();
			s = new Student(sno, sname, score);
			s.next = head.next;
			head.next = s;
			System.out.println("�Ƿ��������(y/n):");
			todo = input.next();
		}
		*/
	}

	@Override
	public Student find(String sname) {
		// ���Ǵ�ͷ��β�ң���û���ҵ�β����û�ҵ�ʱ������ѭ������
		Student p = head.next;
		while (p != null && !p.sname.equals(sname)) { // ˳�򽻻��������ָ���쳣�����ڵ�˳������ö�·���ʽ�ƽ�
			p = p.next;
		}
		return p;
	}

	@Override
	public Student indexOf(int i) {
		// �����������û�ҵ�β��û�ҵ�ʱ������ѭ����
		Student p = head;
		int j = 0;
		if (i < 0) { // ����������ֱ�ӽ���
			return null;
		} else {
			while (p != null && j < i) {
				p = p.next;
				j++;
			}
			return p;
		}
	}

	@Override
	public boolean insert(int i, Student s) {
		Student p = indexOf(i - 1); // ����Ĺؼ��Ƕ�λָ������ǰ�����
		if (p == null) {
			return false;
		} else {
			s.next = p.next;
			p.next = s;
			return true;
		}
	}

	@Override
	public boolean append(Student s) {
		// ׷�ӵĹؼ��Ƕ�λָ�뵽����㣬��׷�ӵ��ǰ��
		Student p = head;
		while (p.next != null) {
			p = p.next;
		}
		p.next = s;
		return true;
	}

	@Override
	public boolean deleteByKey(String sname) {
		// ɾ��ʱ�ؼ���ָ�붨λ��ɾ����ǰ�����,Ҫע�⣬ǰ����������һ�����ͷ�����㣬ɾ����ͬ
		Student p = head;
		while (p.next != null && !p.next.sname.equals(sname)) {// p.next != null���ں���ɲ�����ָ���쳣�������ö�·���ʽ�ƽ�
			p = p.next;
		}
		if (p.next != null) { // �ҵ���ǰ����㲻�����һ�����
			p.next = p.next.next;
			return true;
		} else { // �ҵ���ǰ����������һ����㣬����ʱָ�붨λ���������
			return false;
		}
	}

	@Override
	public boolean deleteById(int i) {
		Student p = indexOf(i - 1);// ɾ��ʱ�ؼ���ָ�붨λ��ɾ����ǰ�����
		if (p == null) {
			return false;
		} else if (p.next == null) {
			return false;
		} else {
			p.next = p.next.next;
			return true;
		}
	}

	@Override
	public boolean updateByKey(String sname, Student s) {
		Student p = find(sname);
		if (p == null) {
			return false;
		}else {
			p.sno = s.sno;
			p.sname = s.sname;
			p.score = s.score;
			return true;
		}
	}

	@Override
	public boolean updateById(int i ,Student s) {
		Student p = indexOf(i);
		if (p == null) {
			return false;
		}else {
			p.sno = s.sno;
			p.sname = s.sname;
			p.score = s.score;
			return true;
		}
	}
}
