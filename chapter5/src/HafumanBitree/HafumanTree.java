package HafumanBitree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HafumanTree {
	// �����������������ع��������ĸ�����ַ
	public HTreeNode create(int[] arr) {
		// 1.���������ֵ������arr���������Ԫ��ֵ����HTreeNode���
		// 2.��HTreeNode���뵽ArrayList��̬������
		List<HTreeNode> HTreeNodes = new ArrayList<HTreeNode>();
		for (int value : arr) {
			HTreeNode HTreeNode = new HTreeNode(value);
			HTreeNodes.add(HTreeNode);
		}
		//��ѭ������������������
		while (HTreeNodes.size() > 1) {
			// �����С����
			Collections.sort(HTreeNodes);
			// ȡ�����ڵ�Ȩֵ��С�Ķ�����
			HTreeNode leftHTreeNode = HTreeNodes.get(0);
			// ȡ�����ڵ�Ȩֵ�ڶ�С�Ķ�����
			HTreeNode rightHTreeNode = HTreeNodes.get(1);
			// /���������¸������¶�����
			HTreeNode parent = new HTreeNode(leftHTreeNode.value + rightHTreeNode.value);
			parent.lchild = leftHTreeNode;
			parent.rchild = rightHTreeNode;
			// �ڽ��������ɾ�����ù��Ľڵ�
			HTreeNodes.remove(leftHTreeNode);
			HTreeNodes.remove(rightHTreeNode);
			// ���¹�����parent���뵽HTreeNodes
			HTreeNodes.add(parent);
		}
		return HTreeNodes.get(0); //ѭ������ʱ����̫������ֻʣһ����㣬����������������������ĸ���㣬����ֵ��ַ
	}
	
	public void PreOrder(HTreeNode t){
		if(t!=null){
			System.out.print(t.value+"  ");
			PreOrder(t.lchild);
			PreOrder(t.rchild);
		}		
	}
}
