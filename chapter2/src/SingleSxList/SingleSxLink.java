package SingleSxList;
import java.util.Scanner;

public class SingleSxLink implements ILinkListMethod {

	private StudNode head = null;

	public SingleSxLink() {
		head = new StudNode(); // ����ͷ���
		head.next = head; // ͷ����ָ����Ϊhead
	}

	/**
	 * ��ͷ�巨������ѭ������
	 */
	@Override
	public void createLinkList() {
		Scanner input = new Scanner(System.in);
		String sno = "", sname = "";
		double score = 0;
		StudNode s = null, p = head;
		String todo="y";
		while(todo.toUpperCase().equals("Y")){
			System.out.println("������ѧ�ţ�");
			sno = input.next();
			System.out.println("������������");
			sname = input.next();
			System.out.println("������ɼ���");
			score = input.nextDouble();
			s = new StudNode(sno, sname, score);
			s.next = p.next;
			head.next = s;
			System.out.println("�Ƿ������������Ϣ��y/n����");
			todo=input.next();
		} 
	}

	/**
	 * ��ȡ��������ĳ���
	 */
	@Override
	public int size() {
		StudNode p = head.next;
		int len=0;
		while(p!=head){
			len++;
			p=p.next;
		}
		return len;
	}

	/**
	 * ȡ��i��Ԫ�صĽ�㣺�д˽ڵ㣬������ָ�룬���򷵻ؿ�null,��iΪ0ʱ��ȡ����ͷ����ָ��
	 */
	@Override
	public StudNode indexOf(int i) {
		StudNode p = head;
		if (i < 0 ) {
			return null;
		} else {
			int j = 0;
			while ((j < i) && (p.next!= head)) {
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

	/**
	 * ���ؼ��ֲ��ҽ�㣺�ҵ����ش˽���ָ�룬�Ҳ��������ؿ�null
	 */
	@Override
	public StudNode find(String key) {
		StudNode p = head.next;
		while(p!=head && !(p.name.equals(key))){
			p=p.next;
		}
		return p == head ? null : p;
	}

	/**
	 * ��ָ��λ��i������һ����㣺����ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean insert(int i, StudNode s) {
		StudNode p = indexOf(i-1);
		if(p == null){
			System.out.println("����λ�ò���ȷ��");
			return false;
		}
		else{
			s.next = p.next ;
			p.next = s;
			return true;
		}
	}

	/** 
	 * ������β��׷�ӽ�㣬����ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean append(StudNode s) {
		StudNode p = head;
		while(p.next!=head){//pǰ���������ǰ����������β���		
			p=p.next;
		}
		s.next=head;
		p.next=s;
		return true;
	}

	/**
	 * ɾ����i����㣺���ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean delete(int i) {
		StudNode p = indexOf(i-1);
		if(p==null || p.next == head){ //��p.next == head ʱ����û��i��㣬�����ҵ�i-1���
			return false;
		}
		else{
			p.next=p.next.next ;
			return true;
		}
	}

	/**  
	 * �б��Ƿ��
	 */
	@Override
	public boolean isEmpty() {
		return head.next == head ? true : false;
	}

	@Override
	public String printList() {		
		StringBuilder sb = new StringBuilder();
		StudNode p = head.next;
		while (p != head) {
			sb.append(p.studentNo + "\t" + p.name + "\t" + p.score + "\n");
			p = p.next;
		}
		return sb.toString();
	}
}
