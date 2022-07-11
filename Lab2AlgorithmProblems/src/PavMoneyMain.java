import java.util.Scanner;

public class PavMoneyMain {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int []array;
		
		System.out.println("Enter the size of the transaction array:");
		int size=sc.nextInt();
		array= new int[size];
	
		System.out.println("Enter the values of the transaction array:");
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		
		int choice=0;
		
		do
		{
			System.out.println("\n-------------------------------");
			System.out.println("Enter your choice:");
			System.out.print("1. Target Checker \n2.Exit \n");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1: TargetChecker(array, size); break;
			case 2:	System.out.println("Exiting...!!"); break;
			
			default:
				System.out.println("Enter a valid choice..!!");
			}
			
		}while(choice!=2);
		

	}

	static void TargetChecker(int []array, int size)
	{
		Scanner sc=new Scanner(System.in);
		
		int count=0, flag=0;
		System.out.println("Enter the value of the target:");
		int target=sc.nextInt();
		int transaction=0;
		
		for(int i=0;i<size;i++)
		{
			count++;
			transaction=transaction+array[i];
			if(transaction>=target)
			{	flag=1;
				break;
			}
			
		}
		
		if(flag==0)
			System.out.println("Traget not achived");
		else
			System.out.println("Target achieved in "+count+" transactions");
		
	}
}
