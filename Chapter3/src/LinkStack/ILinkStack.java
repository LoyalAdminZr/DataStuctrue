package LinkStack;

public interface ILinkStack {
//	(1) ����һ����ջS��initStack() //������㷨�����캯���������

//	(2) �ж�ջS�Ƿ�Ϊ�գ�isEmpty()
	boolean isEmpty();
	
//	(3) ����S��ջ��Ԫ�أ�getTop()
	StudNode getTop();
	
//	(4) ��ջ��push(e)
	boolean push(StudNode e);
	
//	(5) ��ջ��pop()
    boolean pop();
}
