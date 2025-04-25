package SingleSxList;

public interface ILinkListMethod {
//	(1) ����������SetLinkList() ������һ��������
	public void createLinkList();
//	(2) ������ĳ���GetLength()�����س���������
	public int size();
//	(3) ȡ��i��Ԫ�صĽ�� GetNode(i)���д˽ڵ㣬������ָ�룬���򷵻ؿ�null
	public StudNode indexOf(int i);
//	(4) ���ҽ��Location(key)���ҵ����ش˽���ָ�룬�Ҳ��������ؿ�null
	public StudNode find(String key);
//	(5) ��ָ��λ��i������һ�����Insert(i��node) ������ɹ�����true��ʧ�ܷ���false
	public boolean insert(int i,StudNode node);
//	(6) ׷��Append(node) ��������β׷��һ��Ԫ�أ�����ɹ�����true��ʧ�ܷ���false
	public boolean append(StudNode node);
//	(7) ɾ����i�����Delete(i)�����ɹ�����true��ʧ�ܷ���false
	public boolean delete(int i);
//	(8) �б��Ƿ�� Empty()
	public boolean isEmpty();
//	(9) ����������VisitAll()��������������������
	public String printList();
}
