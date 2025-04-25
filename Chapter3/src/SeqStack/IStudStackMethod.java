package SeqStack;

public interface IStudStackMethod {
	// (1) 建立一个空栈S：initStack()
	// (2) 判断栈S是否为空：isEmpty()
	public boolean isEmpty();
	// (3) 返回S的栈顶元素：getTop()
	public StudNode getTop();
	// (4) 入栈：push(e)
	public boolean push(StudNode e);	
	// (5) 出栈：pop()
	public boolean pop();
}
