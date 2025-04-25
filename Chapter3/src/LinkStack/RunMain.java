package LinkStack;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args){
		StudNodeLinkStack studsStack = new StudNodeLinkStack();
		Scanner input =new Scanner(System.in);
		String sno = "", sname = "";
		StudNode s = null;
		double score = 0;
		boolean result;
		while (true) {
			System.out.println("********学生成绩管理程序**********");
			System.out.println("1 学生信息入栈");
			System.out.println("2 显示栈顶元素");
			System.out.println("3 学生信息出栈");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			int choice = input.nextInt();
			switch (choice) {
			case 0:
				input.close();
				System.exit(0);
			case 1:
				System.out.println("请输入学号：");
				sno = input.next();
				System.out.println("请输入姓名：");
				sname = input.next();
				System.out.println("请输入成绩：");
				score = input.nextDouble();
				s = new StudNode(sno, sname, score);
				result = studsStack.push(s);
				if (result) {
					System.out.println("入栈成功");
				} else {
					System.out.println("入栈失败,栈已满，上溢出！");
				}
				break;
			case 2:
				s = studsStack.getTop();
				if(s==null){
					System.out.println("栈为空");
				}else{
					System.out.println(s.studentNo+" "+s.name+" "+s.score);
				}
				break;
			case 3:
				s = studsStack.getTop();
				result = studsStack.pop();
				if (result) {
					System.out.println("出栈成功");
				} else {
					System.out.println("出栈失败");
				}
				break;
			default:
				System.out.println("选择错误，请重选");
				break;
			}
		}
	}
}
