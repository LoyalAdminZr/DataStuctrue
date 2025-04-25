package SeqList;

public interface ISeqList{
	//�ӿ��Ƕ�����󷽷��ģ������ݽṹ�У�������������ÿ�����ݽṹ�Ļ��������
	//��ʼ�����������洢���ݵ����飬��JAVA�г�ʼ���ɹ��캯�����
	//�п�
	public boolean IsEmpty();
	//�󳤶�
	public int Size();
	//��ӡ
	public String PrintList();	
	//����
	public boolean Insert(int i,Student s);
	//׷��
	public boolean Append(Student s);
	//����Ų��ң�������Ч���±���ţ��鲻������-1
	public int IndexOf(int i); 
	//���ؼ��ֲ��ң�������Ч���±���ţ��鲻������-1
	public int Find(String sname);
	//�����ɾ��
	public boolean DeleteById(int i);
	//���ؼ���ɾ��
	public boolean DeleteByKey(String sname);	
	//������޸�
	public boolean UpdateById(int i, Student s);
	//���ؼ����޸�
	public boolean UpdateByKey(String sname,Student s);

}
