import java.util.Scanner;
class Node1{
	int data;
	Node1 next;
}
public class linkedlist2 {
    Node1 head;
    void create(int n) {
    Scanner sc=new Scanner(System.in);
    Node1 newnode,temp;
    int data;
    head=new Node1();
    if(head==null) {
    	System.out.println("no value in head");
    }
    data =sc.nextInt();
    head.data=data;
    head.next=null;
    temp=head;
    
    for(int i = 0;i<n;i++) {
    	newnode=new Node1();
    	data=sc.nextInt();
    	newnode.data=data;
    	newnode.next=null;
    	temp.next=newnode;
    	temp=temp.next;
    	
    	
    }
    }
    
    	
    void display() {
    	Node1 temp=head;
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linkedlist2 list=new linkedlist2();
		int n=sc.nextInt();
		list.create(n);
		list.display();
	}
	

}
