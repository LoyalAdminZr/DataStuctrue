package LinkStack;

public interface ILinkStack {
//	(1) 建立一个空栈S：initStack() //不需此算法，构造函数可完成它

//	(2) 判断栈S是否为空：isEmpty()
	boolean isEmpty();
	
//	(3) 返回S的栈顶元素：getTop()
	StudNode getTop();
	
//	(4) 入栈：push(e)
	boolean push(StudNode e);
	
//	(5) 出栈：pop()
    boolean pop();
}
