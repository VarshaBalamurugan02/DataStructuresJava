

	import java.util.*;
	class Node2{
		int data;
		 Node2 prev ;
		 Node2 next;
	}
	public class doublylinkedlist {
		 Node2 head;
	     void Create(int n) {
	   	  Scanner sc=new Scanner(System.in);
	   	  Node2 temp,newnode;
	   	  int data;
	   	  head=new Node2();
	   	  if(head==null) {
	   		  System.out.println("no data in head");
	   		  
	   	  }
	   	  data=sc.nextInt();
	   	  head.data=data;
	   	  head.prev=null;
	   	  head.next=null;
	   	  temp=head;
	  
	  for(int i=1;i<n;i++) {
		  newnode=new Node2();
		  data=sc.nextInt();
		  newnode.data=data;
		  newnode.prev=temp;
		  newnode.next=null;
		  temp.next=newnode;
		  temp=temp.next;
	  }
	  }
	  void display() {
		  
		  Node2 temp=head;
		  while(temp!=null) {
			  System.out.println(temp.data);
			  temp=temp.next;
		  }
	  }
	 /* void insertbeg(int e) {
		  Node2 newnode=new Node2();
		  newnode.data=e;
		  newnode.next=head;
		  head=newnode;
	  }*/
	 /*void insertend(int f) {
		  Node2 newnode=new Node2();
		  newnode.data=f;
		  newnode.next=null;
		  Node2 temp;
		  temp=head;
		  while(temp.next!=null) {
			  temp=temp.next;
		  }
		  temp.next=newnode;
		  newnode.prev=temp;
	  }*/
	  void insertmiddle(int v,int pos) {
		  Node2 newnode=new Node2();
		  newnode.data=v;
		  newnode.prev=head;
		  newnode.next=null;
		  Node2 temp=head;
		  for(int i=0;i<pos-1;i++) {
			  temp=temp.next;
		  }
		  newnode.next=newnode;
		  
	  }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			doublylinkedlist obj=new doublylinkedlist();
			int n=sc.nextInt();
			obj.Create(n);
			obj.display();
			//int e=sc.nextInt();
			//obj.insertbeg(e);
			//int f=sc.nextInt();
			//obj.insertend(f);
			int v=sc.nextInt();
			int pos=sc.nextInt();
			obj.insertmiddle(v,pos);
			

		}
		

	}
