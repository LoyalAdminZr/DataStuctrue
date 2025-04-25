package LinkStack;

public class StudNodeLinkStack implements ILinkStack {
	StudNode top;

	public StudNodeLinkStack() { // ���캯����ʵ�ֹ�������ջ
		top = null;
	}

	@Override
	public boolean isEmpty() { // ��ջ�Ƿ��
		return top == null ? true : false;
	}

	@Override
	public StudNode getTop() { // ����ջ��Ԫ�أ���ջ�գ�����null�����򷵻�ջ��Ԫ�صĵ�ַ�����ã�
		if (isEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean push(StudNode e) { // ��ջ
		e.next = top;
		top = e;
		return true;
	}

	@Override
	public boolean pop() {    //��ջ		
		if (isEmpty()) {
			return false;
		} else {
			top =top.next;
			return true;
		}
	}
}
