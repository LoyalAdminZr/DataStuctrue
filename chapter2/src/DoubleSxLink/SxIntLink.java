package DoubleSxLink;
import java.util.Scanner;

public class SxIntLink implements IdlinkMethods{
	IntNode head = null;

	public SxIntLink() {
		super();
		head = new IntNode();
		head.next = head;
		head.prior = head; 
	}

	@Override
	public void createSxLink() {
		int x;
		String todo ="y";
		IntNode p = head,s = null;
		// ===========��β�巨����������=================
		Scanner input = new Scanner(System.in);
		while (todo.toUpperCase().equals("Y")) {
			System.out.println("������ֵ");
			x = input.nextInt();
			s = new IntNode(x);
			s.next = p.next;
			s.prior = p;
			p.next = s;
			head.prior = s;
			p = p.next;
			System.out.println("�Ƿ��������(y/n)");
			todo = input.next();
		}
		
	}

	@Override
	public int size() {
		IntNode p = head.next;
		int n = 0;
		while (p != head) {
			n++;
			p = p.next;
		}
		return n;
	}

	@Override
	public IntNode indexOf(int i) {
		IntNode p = head;
		if (i < 0) {
			return null;
		} else {
			int j = 0;
			while ((j < i) && (p.next != head)) {
				p = p.next;
				j++;
			}
			if(j == i){
				return p;
			}else{
				return null;
			}
		}
	}
	
	@Override
	public IntNode find(int x) {
		IntNode p = head.next;
		while (p != head && p.getX()!=x ) {
			p = p.next;
		}
		return p == head ? null : p;
	}

	@Override
	public boolean insert(int i, IntNode s) {
		IntNode p = indexOf(i - 1);
		if (p == null) {
			System.out.println("����λ�ò���ȷ��");
			return false;
		} else {
			s.prior = p;
			s.next = p.next;
			s.next.prior = s;
			p.next = s;
			return true;
		}
	}

	@Override
	public boolean append(IntNode s) {
		IntNode p = head;
		while (p.next != head) { //pǰ���������ǰ����������β���
			p = p.next;
		}		
		s.next = p.next;
		s.prior = p;		
		p.next = s;
		head.prior = s;		
		return true;
	}

	@Override
	public boolean delete(int i) {
		IntNode p = indexOf(i-1);
		if (p == null || p.next == head) { //��p.next == head ʱ����û��i��㣬�����ҵ�i-1���
			System.out.println("��ɾ���i����ȷ");
			return false;
		} else {
			p.next = p.next.next;
			p.next.prior = p;
			return true;
		}
	}

	@Override
	public boolean isEmpty() {		
		return head.next == head?true:false;
	}

	@Override
	public String printList() {
		StringBuilder sb = new StringBuilder();
		IntNode p = head.next;
		while (p != head) {
			sb.append(p.getX() + "   ");
			p = p.next;
		}
		return sb.toString();
	}	
}
