package SeqList;

public class StudSeqList implements ISeqList{
	//�� = ���� + ���캯�� + ����
	final int MaxLen = 100;
	Student []studs = null;
	int length;
	
	public StudSeqList() {
		super();
		studs = new Student[MaxLen]; 
		length = 0;
	}

	@Override
	public boolean IsEmpty() {		
		return length == 0 ? true : false;
	}

	@Override
	public int Size() {		
		return length;
	}

	@Override
	public String PrintList() {
		StringBuilder sb = new StringBuilder();
		sb.append("���"+"\t"+"ѧ��"+"\t"+"����"+"\t"+"����"+"\n");
		for(int i=0;i<length;i++){
			sb.append((i+1)+"\t"+ studs[i].sno+"\t"+studs[i].sname+"\t"+studs[i].score+"\n");
		}
		sb.append("��Ԫ�ظ���Ϊ"+length+"\n");
		return sb.toString();
	}

	@Override
	public boolean Insert(int i, Student s) {
		if(length>=MaxLen){
			System.out.println("˳�������\n");
			return false;
		}else if(i<=0 ||i>length+1){
			System.out.println("�����λ������\n");
			return false;
		}else{
			for(int k=length-1;k>=i-1;k--){
				studs[k+1] = studs[k];
			}
			studs[i-1] = s;
			length++;
			return true;
		}
	}

	@Override
	public boolean Append(Student s) {
		if(length>=MaxLen){
			System.out.println("˳�������\n");
			return false;
		}else{
			studs[length] = s;
			length++;
			return true;
		}
	}

	@Override
	public int IndexOf(int i) {
		if(i<=0 || i>length) {
			System.out.println("�����������");
			return -1;
		}else {
			return i-1 ; 
		}
	}

	@Override
	public int Find(String sname) {
		int result = -1;
		for(int i=0;i<length;i++) {
			if(studs[i].sname.equals(sname)) {
				result = i;
				break;
			}
		}
		return result;
	}

	@Override
	public boolean DeleteById(int i) {
		if(i<=0 || i>length) {
			System.out.println("��ɾ���������");
			return false;
		}else {
			for(int k= i;k<=length;k++) {
				studs[k-1] = studs[k];
			}
			length--;
			return true;
		}
	}

	@Override
	public boolean DeleteByKey(String sname) {
		int i = Find(sname);
		if(i==-1) {
			System.out.println("û�ҵ��˶���");
			return false;
		}else {
			for(int k= i+1;k<length;k++) {
				studs[k-1] = studs[k];
			}
			length--;
			return true;
		}
	}

	@Override
	public boolean UpdateById(int i, Student s) {
		int k = IndexOf(i);
		if(k==-1) {
			System.out.println("�����µ��������");
			return false;
		}else {
			studs[k] = s;
			return true;
		}
	}

	@Override
	public boolean UpdateByKey(String sname, Student s) {
		int k = Find(sname);
		if(k==-1) {
			System.out.println("���޴���");
			return false;
		}else {
			studs[k] = s;
			return true;
		}
	}	
}
