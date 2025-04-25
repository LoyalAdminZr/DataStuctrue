package StudLinkList;

public class Student {
	//ѧ��ʵ����
	String sno;
	String sname;
	float score;
	Student next = null;
	//���캯���������ڴ�������Ķ���ʱ�������ݳ�Ա��ʼ������ֵ��
	public Student() {
		super();
	}
	public Student(String sno, String sname, float score) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.score = score;
	}	
}
