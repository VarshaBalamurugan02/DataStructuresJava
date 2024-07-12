class Node8{
	int data;
	Node8 left,right;

public Node8(int item) {
	data=item;
	left=right=null;
}
}
public class binarysearchtree {

	Node8 root;
	binarysearchtree()
	{
		root=null;
	}
  
Node8 insert(Node8 root,int data) {
	if(root==null) {
		root=new Node8(data);
		return root;
	}
	if(data<root.data)
	{
		root.left=insert(root.left,data);
	}
	else if(data>root.data) {
		root.right=insert(root.right,data);
	}
	return root;
}

public Node8 delete(Node8 root,int d) {
	if(root==null) {
		return root;
	}
	if(d<root.data) {
		root.left=delete(root.left,d);
	}
	else if(d>root.data) {
		root.right=delete(root.right,d);
	}
	else {
		if(root.right==null) {
			return root.left;
		}
		else if(root.left==null) { 
			return root.right;
		}
		root.data=min(root.right);
		root.right=delete(root.right,root.data);
	}
	
	
	
  return root;
}
public int min(Node8 root) {
	int minval=root.data;
	while(root.left!=null) {
		minval=root.left.data;
		root=root.left;
	}
	return minval;
}
	


void InorderTraversal(Node8 node) {
	if(node!=null) {
		InorderTraversal(node.left);
		System.out.println(node.data+" ");
		InorderTraversal(node.right);
		
	}
}
void preorderTraversal(Node8 node) {
	if(node!=null) {
		
		System.out.println(node.data+" ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
		
	}
}
void postorderTraversal(Node8 node) {
	if(node!=null) {
		postorderTraversal(node.left);
		
		postorderTraversal(node.right);
		System.out.println(node.data+" ");
		
	}
}

	public static void main(String[] args) {
		binarysearchtree tree=new binarysearchtree();
		tree.root=tree.insert(tree.root,50);
		tree.insert(tree.root,30);
		tree.insert(tree.root,20);
		tree.insert(tree.root,40);
		tree.insert(tree.root,70);
		tree.insert(tree.root,60);
		tree.insert(tree.root,80);
		tree.delete(tree.root,30);
		System.out.println("Inorder traversal:");
		tree.InorderTraversal(tree.root);
		System.out.println();
		System.out.println("preorder traversal:");
		tree.preorderTraversal(tree.root);
		System.out.println();
		System.out.println("postorder traversal:");
		tree.postorderTraversal(tree.root);
		System.out.println();


	}

}

