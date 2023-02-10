import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,sum=0;
		System.out.print("Enter N : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}
}
