import java.util.Scanner;

public class DenominationChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []denominations;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of denominations available:");
		int deno_count=sc.nextInt();
		denominations=new int[deno_count];
		
		System.out.println("Enter the value of denominations:");
		for(int i=0;i<deno_count;i++)
			denominations[i]=sc.nextInt();
		
		MergeSort ob=new MergeSort();
		ob.DivideArray(denominations, deno_count);
		
			
		System.out.println("Enter the amount to be paid");
		int payment=sc.nextInt();
		
		int []paymentDenomination=new int[deno_count];
		
		for(int i=deno_count-1;i>=0;i--)
		{
			if(payment>=denominations[i])
			{
				paymentDenomination[i]=payment/denominations[i];
				payment=payment-(denominations[i]*paymentDenomination[i]);
			}

		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=deno_count-1;i>=0;i--)
		{
			if(paymentDenomination[i]>0)
		 System.out.println(denominations[i]+": "+paymentDenomination[i]);
		}
			
	}
	
	

}
