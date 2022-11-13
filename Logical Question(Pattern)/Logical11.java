import java.util.Scanner;
class Logical11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		     int n = sc.nextInt();
			 int i,j;
			 int alphabet=64;
			 for(i=n;i>=1;i--)
			 {
				 for(j=1; j<=i; j++)
				 { 
			       System.out.print((char)(alphabet+j)+" ");
				 }
				 System.out.println();
			 }
			 for(i=2;i<=n;i++)
			 {
				 for(j=1; j<=i; j++)
				 { 
			       System.out.print((char)(alphabet+j)+" ");
				 }
				 System.out.println();
			 }
			 
			 
    }
}