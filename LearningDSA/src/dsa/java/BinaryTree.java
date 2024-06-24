package dsa.java;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class BinaryTree {
	private TreeNode root;
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		public TreeNode(int data) {
			this.data = data;
		}
	}
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(4);
		TreeNode third = new TreeNode(5);
		TreeNode fourth = new TreeNode(6);
		TreeNode fifth = new TreeNode(7);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		
	}
	
	public void preOrderRecursive(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " " );
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
		System.out.println();
	}
	public void preOrderIterative() {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right!=null) {
				stack.push(temp.right);
			}
		    if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
		System.out.println();
	}
	public void inOrderRecursive(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrderRecursive(root.left);
		System.out.print(root.data + " ");
		inOrderRecursive(root.right);
	}
	public void inOrderIterative() {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}
	}
	public void postOrderRecursive(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrderRecursive(root.left);
		inOrderRecursive(root.right);
		System.out.print(root.data + " ");
	}
	public void postOrderIterative() {
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		while(current != null || !stack.isEmpty()) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			}
			else {
				TreeNode temp = stack.peek().right;
				if(temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				}
				else {
					current = temp;
				}
			}
		}
	}
	public void levelOrderTraversal() {
		if(root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.print(temp.data + " ");
			if(temp.left!=null) {
				q.offer(temp.left);
			}
			if(temp.right != null) {
				q.offer(temp.right);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
//		bt.preOrderRecursive(bt.root);
//		bt.preOrderIterative();
//		bt.inOrderRecursive(bt.root);
//		System.out.println();
//		bt.inOrderIterative();
//		System.out.println();
//		bt.postOrderRecursive(bt.root);
//		System.out.println();
//		bt.postOrderIterative();
		bt.levelOrderTraversal();
	}

}
