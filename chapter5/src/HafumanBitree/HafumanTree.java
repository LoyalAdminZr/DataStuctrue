package HafumanBitree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HafumanTree {
	// 创建哈夫曼树，返回哈夫曼树的根结点地址
	public HTreeNode create(int[] arr) {
		// 1.遍历存放树值的数组arr，用数组各元素值构成HTreeNode结点
		// 2.将HTreeNode加入到ArrayList动态数组中
		List<HTreeNode> HTreeNodes = new ArrayList<HTreeNode>();
		for (int value : arr) {
			HTreeNode HTreeNode = new HTreeNode(value);
			HTreeNodes.add(HTreeNode);
		}
		//此循环用来创建哈夫曼树
		while (HTreeNodes.size() > 1) {
			// 排序从小到大
			Collections.sort(HTreeNodes);
			// 取出根节点权值最小的二叉树
			HTreeNode leftHTreeNode = HTreeNodes.get(0);
			// 取出根节点权值第二小的二叉树
			HTreeNode rightHTreeNode = HTreeNodes.get(1);
			// /构建含有新根结点的新二叉树
			HTreeNode parent = new HTreeNode(leftHTreeNode.value + rightHTreeNode.value);
			parent.lchild = leftHTreeNode;
			parent.rchild = rightHTreeNode;
			// 在结点数组中删除掉用过的节点
			HTreeNodes.remove(leftHTreeNode);
			HTreeNodes.remove(rightHTreeNode);
			// 将新构建的parent加入到HTreeNodes
			HTreeNodes.add(parent);
		}
		return HTreeNodes.get(0); //循环结束时，动太数组中只剩一个结点，这个结点就是整个哈夫曼树的根结点，返回值地址
	}
	
	public void PreOrder(HTreeNode t){
		if(t!=null){
			System.out.print(t.value+"  ");
			PreOrder(t.lchild);
			PreOrder(t.rchild);
		}		
	}
}
