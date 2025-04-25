package SeqStack;

public class StudSeqStack implements IStudStackMethod {
	final int MaxLen = 100;
	StudNode[] stds = new StudNode[MaxLen];
	int top;

	public StudSeqStack() {
		super();
		top = -1; // ¹¹½¨¿ÕÕ»
	}

	@Override
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	@Override
	public StudNode getTop() {
		if (isEmpty()) {
			return null;
		} else {
			return stds[top];
		}
	}

	@Override
	public boolean push(StudNode e) {
		if (top >= MaxLen - 1) {
			return false;
		} else {
			top++;
			stds[top] = e;
			return true;
		}
	}

	@Override
	public boolean pop() {
		if (!isEmpty()) {
			top--;
			return true;
		} else {
			return false;
		}
	}

}
