import java.util.Scanner;

public class stack {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int stack[]=new int[n];
			int top=-1;
			while(true) {
				System.out.println("Enter 1 to push");
				System.out.println("Enter 2 to pop");
				System.out.println("Enter 3 to peek");
				System.out.println("Enter 4 to display");
				System.out.println("Enter 5 to Exit");
				int choice=sc.nextInt();
				switch (choice) { 
				case 1 :
					if(top==n-1) {
					System.out.println("Stack is overflow");
				}
					else {
						int x=sc.nextInt();
						top++;
						stack[top]=x;
					}
					break;
				case 2:
					if(top==-1)
					{
						System.out.println("Stack is underflow");
					}
					else {
						System.out.println(stack[top]);
						top--;
					}
					break;
				case 3:
					System.out.println("Top");
					System.out.println(" top value"+stack[top]);
					break;
				case 4:
					System.out.println("Display");
					for(int i=0;i<=top;i++) {
						System.out.println(stack[i]+" ");
					}
					break;
				case 5:
					System.out.println("Exit");
				return;
				default:
					System.out.println("Invalid choice");
				
			}
		}
	}
	}
		




