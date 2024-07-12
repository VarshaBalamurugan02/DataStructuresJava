import java.util.Scanner;
class Node{
	int data;
	Node next;
}
public class linkedlist1 {
      Node head;
      void Create(int n) {
    	  Scanner sc=new Scanner(System.in);
    	  Node temp,newnode;
    	  int data;
    	  head=new Node();
    	  if(head==null) {
    		  System.out.println("no data in head");
    		  
    	  }
    	  data=sc.nextInt();
    	  head.data=data;
    	  head.next=null;
    	  temp=head;
    	  for(int i=1;i<n;i++) {
    		  newnode=new Node();
    		  data=sc.nextInt();
    		  newnode.data=data;
    		  newnode.next=null;
    		  temp.next=newnode;
    		  temp=temp.next;
    	  }
      }
      void display() {
    	  Node temp=head;
    	  while(temp!=null) {
    		  System.out.print(temp.data);
    		  temp=temp.next;
    	  }
      }
      /*void insmid(int e,int pos) {
    	  Node newnode=new Node();
    	  
    	  newnode.data=e;
    	  newnode.next=null;
    	 Node temp=head;
    	 for(int i=0;i<pos-1;i++){
    	     temp=temp.next;
    	 }
    	 newnode.next=temp.next;
    	 temp.next=newnode;
      }*/
      /*void insbeg(int d) {
    	  Node newnode=new Node();
    	  newnode.data=d;
    	  newnode.next=head;
    	  head=newnode;*/
    	  
      /*void deletion(){
	      Node temp=head;
	      head=head.next;
	      temp.next=null;
	  }*/
      /*void delatend (){
          Node temp=head;
          Node temp1=null;
          while(temp.next!=null){
              temp1=temp;
              temp=temp.next;
          }
          temp1.next=null;
      }*/
      /*void delMid(int p) {
    	  Node prev=head;
    	  Node temp=head.next;
    	  for(int i=1;i<p;i++) {
    		  prev=prev.next;
    	  }
    	  prev.next=prev.next.next;
      }
      
      void delMiddata(int data){
          Node prev=head;
          while(prev.next !=null&&prev.next.data !=data){
              prev=prev.next;
          }
          if(prev.next !=null){
              prev.next=prev.next.next;
          }
          }*/
      
      
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linkedlist1 list=new linkedlist1();
		int n=sc.nextInt();
		list.Create(n);
		int data=sc.nextInt();
		//list.delMiddata(data);
		//int p=sc.nextInt();
		//list.delMid(p);
		//list.deletion();
		//list.delatend();
		//int e=sc.nextInt();
		//int pos=sc.nextInt();
		//list.insmid(e,pos);
		//int d=sc.nextInt();
		//list.insbeg(d);
		list.display();
		
		
	}

}
