package LinkStack;

public class StudNodeLinkStack implements ILinkStack {
	StudNode top;

	public StudNodeLinkStack() { // 构造函数，实现构建空链栈
		top = null;
	}

	@Override
	public boolean isEmpty() { // 判栈是否空
		return top == null ? true : false;
	}

	@Override
	public StudNode getTop() { // 返回栈顶元素，若栈空，返回null，否则返回栈顶元素的地址（引用）
		if (isEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean push(StudNode e) { // 入栈
		e.next = top;
		top = e;
		return true;
	}

	@Override
	public boolean pop() {    //出栈		
		if (isEmpty()) {
			return false;
		} else {
			top =top.next;
			return true;
		}
	}
}
