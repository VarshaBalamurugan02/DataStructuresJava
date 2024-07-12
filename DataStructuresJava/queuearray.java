public class queuearray {
static class Node6{
	int data;
	Node6 next;
}
static Node6 front=null,rear=null;
static Node6 newNode(int d) {
	Node6 newnode=new Node6();
	newnode.data=d;
	newnode.next=null;
	return newnode;
}
static void enq(int d) {
	if(front==null) {
		front=newNode(d);
		rear=front;
	}
	else {
		rear.next=newNode(d);
		rear=rear.next;
		
	}
}
 static  int deq() {
	int res=0;
	if(front!=null){
		res=front.data;
		front=front.next;
	}
	else
	
		System.out.println("Queue is empty");
		return res;
	
	
}

	public static void main(String[] args) {
		enq(5);
		enq(6);
		System.out.println(deq());
		System.out.println(deq());
		System.out.println(deq());
		
	}
	

}
