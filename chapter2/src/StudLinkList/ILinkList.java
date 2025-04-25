package StudLinkList;

public interface ILinkList {
	//�ӿ���ֻ�г��󷽷�����ʱ�Ƕ��嵥����Ļ��������
	//�󳤶�
	public int size();
	//�п�
	public boolean isEmpty();
	//��ӡ
	public String printList();
	//����������������ͷ�巨��Ҳ������β�巨
	public void createLinkList();
	//���ؼ��ֲ���
	public Student find(String sname);
	//���߼���Ų���
	public Student indexOf(int i);
	//����
	public boolean insert(int i,Student s);
	//׷��
	public boolean append(Student s);
	//���ؼ���ɾ��
	public boolean deleteByKey(String sname);
	//���߼����ɾ��
	public boolean deleteById(int i);
	//���ؼ��ָ���
	public boolean updateByKey(String sname ,Student s);
	//���߼���Ÿ���
	public boolean updateById(int i ,Student s);
}
