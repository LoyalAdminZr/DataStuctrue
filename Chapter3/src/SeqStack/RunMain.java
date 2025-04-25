package SeqStack;

import java.util.Scanner;

class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sno,sname;
		float score;
		StudNode s = null;
		int choice ;
		boolean result;
		
		Scanner input = new Scanner(System.in);
		StudSeqStack stdstack =new StudSeqStack();
		while(true){
			System.out.println("*****学生成绩栈演示*******");
			System.out.println("1、学生信息入栈");
			System.out.println("2、读取栈顶元素");
			System.out.println("3、学生信息出栈");
			System.out.println("0、退出系统");
			System.out.println("请输入选择(0~3)：");
			choice = input.nextInt();
			switch(choice)
			{
			case 0:
				
				System.exit(0);
				break;
			case 1:
				System.out.println("输入学号");
				sno = input.next();
				System.out.println("输入姓名");
				sname = input.next();
				System.out.println("输入分数");
				score = input.nextFloat();
				s = new StudNode(sno,sname,score);
				result = stdstack.push(s);
				if(result){
					System.out.println("入栈成功");					
				}else{
					System.out.println("入栈失败");
				}
				break;
			case 2:
				s = stdstack.getTop();
				if(s!=null){
					System.out.print(s.sno+"  ");
					System.out.print(s.sname+"   ");
					System.out.println(s.score+"   ");
				}else{
					System.out.println("栈已空");
				}
				break;
			case 3:
				result = stdstack.pop();
				if(result){
					System.out.println("出栈成功");
				}else{
					System.out.println("出栈失败");
				}
				break;			
			}
		}

	}

}
