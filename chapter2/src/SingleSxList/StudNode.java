package SingleSxList;

public class StudNode {
	String studentNo;// ѧ��
	String name; // ����
	double score; // ����
	StudNode next=null; //ָ�루���ã��ֶ�
	public StudNode(){		
	}
	public StudNode(String studentNo, String name, double score) {
		this.studentNo = studentNo;
		this.name = name;
		this.score = score;
	}
	
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
