import java.util.Scanner;
class trees{
	int data;
	trees left,right;
	
	

public trees(int item) {
	 data=item;
	  left=right=null;
	}
	}

public class tree {
 trees root;

void preorderTraversal( trees node) {
	if(node !=null) {
		System.out.println(node.data+" ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
		
	}
}
void InorderTraversal( trees node) {
	if(node !=null) {
		
		InorderTraversal(node.left);
		System.out.println(node.data+" ");
		InorderTraversal(node.right);
		
	}
}
void postorderTraversal( trees node) {
	if(node !=null) {
		
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.println(node.data+" ");
	}
}
	public static void main(String[] args) {
         tree l=new tree();
         l.root =new trees(1);
         l.root.left=new trees(2);
         l.root.right=new trees(3);
         l.root.left.left=new trees(4);
         l.root.left.right=new trees(5);
         l.root.right.left=new trees(6);
         l.root.right.right=new trees(7);
         System.out.println("preorder traversal:");
         l.preorderTraversal(l.root);
         System.out.println();
         System.out.println("Inorder traversal");
         l.InorderTraversal(l.root);
         System.out.println();
         System.out.println("postorder traversal");
         l.postorderTraversal(l.root);
         System.out.println();
        

	}

}
