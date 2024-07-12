import java.util.Scanner;
class Node2{
	int data;
	Node2 next;
	
}
public class Main {
        Node2 head;
        void create(int n) {
        	Scanner sc=new Scanner(System.in);
			Node2 temp,newnode;
        	int data;
        	head=new Node2();
        	if(head==null) {
        		System.out.println("no data in head");
        	}
        	data=sc.nextInt(); 
        	head.data=data;
        	
        	head.next=null;
        	temp=head;
        	
        	for(int i=2;i<=n;i++) {
        	 newnode=new Node2();
        		data=sc.nextInt();
        		newnode.data=data;
        		
        		newnode.next=head;
        		temp.next=newnode;
        		temp=temp.next;
        	}
        }
        	void display(){
        	Node2 temp=head;
        	do{
        	    
        		System.out.print(temp.data);
        	
        		temp=temp.next;
        	}
        	while(temp!=head);
        	
        	}
        /*	void insertbeg(int j){
        		
        		Node2 newnode=new Node2();
        		
        		newnode.data=j;
        		Node2 temp=head;
        		while(temp.next!=head) {
        			temp=temp.next;
        		}
        		newnode.next=head;
        		
        		temp.next=newnode;
        		head=newnode;
        	}*/
        	/*void insertmiddle(int b,int pos) {
	        		Node2 newnode=new Node2();
	        		newnode.data=b;
	        		Node2 temp=head;
	        		for(int i=1;i<pos-1;i++)
	        		{
	        			temp=temp.next;
	        		}
	        		newnode.next=temp.next;
	        		temp.next=newnode;
	        	}*/
	        void insertend(int c){
	            Node2 newnode=new Node2();
	            newnode.data=c;
	            Node2 temp=head;
	            while(temp.next!=head){
	                temp=temp.next;
	            }
	            temp.next=newnode;
	            newnode.next=head;
	            
	        }
        
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Main list=new Main();
		int n=sc.nextInt();
		list.create(n);
		int c=sc.nextInt();
		list.insertend(c);
	//	int b=sc.nextInt();
	//	int pos=sc.nextInt();
	//	list.insertmiddle(b,pos);	
		
		//int j=sc.nextInt();
		//list.insertbeg(j);
		list.display();
		
	}

}
