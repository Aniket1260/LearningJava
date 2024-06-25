package dsa.java;

public class BinarySearchTree {
	private TreeNode root;
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data) {
			this.data = data;
		}
	}
	public void insert(int value) {
		root = insert(root,value);
	}
	public TreeNode insert(TreeNode root,int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		if(root.data>value) {
			root.left = insert(root.left,value);
		}
		if(root.data<value) {
			root.right = insert(root.right,value);
		}
		return root;
	}
	public void inOrderRecursive(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrderRecursive(root.left);
		System.out.print(root.data + " ");
		inOrderRecursive(root.right);
	}
	public TreeNode search(int key) {
		return search(root,key);
	}
	public TreeNode search(TreeNode root,int key) {
		if(root == null || root.data == key) {
			return root;
		}
		if(root.data>key) {
			return search(root.left,key);
		}
		else{
			return search(root.right,key);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(8);
		bst.insert(6);
		bst.insert(4);
		bst.insert(10);
		bst.insert(12);
		bst.insert(5);
		bst.inOrderRecursive(bst.root);
		if(null != bst.search(10)) {
			System.out.print("\nKey Found ");
		}
	}

}
