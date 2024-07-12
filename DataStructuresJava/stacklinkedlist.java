import java.util.Scanner;
class stack{
class Node5{
	int data;
	Node5 next;
	Node5(int data){
		this.data=data;
		this.next=null;
	}
}



Node5 top=null;

public void push(int x) {
		Node5 newnode=new Node5(x);
	if(newnode==null) {
		System.out.println("stack is overflow");
	}
	else {
		newnode.next=top;
		top=newnode;
	}
}

public void pop() {
	if(top==null) {
		System.out.println("stack is underflow");
	}
	else {
		System.out.println(top.data);
		top=top.next;
	}
}
public void peek() {
	System.out.println(top.data);
}

public void display() {
	Node5 temp=top;
	while(temp !=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
}
public class stacklinkedlist {

	public static void main(String[] args) {
		
	
		
		stack list=new stack();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(true) {
			System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
			System.out.println("Enter your choice::");
			int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter value of push");
			int x=sc.nextInt();
			 list.push(x);
			break;
		case 2:
			list.pop();
			break;
		case 3:
			list.peek();
			break;
		case 4:
			list.display();
			break;
		default:
			System.out.println("Invalid");
			
		}
	
	}

	}
}


