package SeqStack;

public interface IStudStackMethod {
	// (1) ����һ����ջS��initStack()
	// (2) �ж�ջS�Ƿ�Ϊ�գ�isEmpty()
	public boolean isEmpty();
	// (3) ����S��ջ��Ԫ�أ�getTop()
	public StudNode getTop();
	// (4) ��ջ��push(e)
	public boolean push(StudNode e);	
	// (5) ��ջ��pop()
	public boolean pop();
}
