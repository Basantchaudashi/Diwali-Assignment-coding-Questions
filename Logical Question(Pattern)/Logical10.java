import java.util.Scanner;
class Logical10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		     int n = sc.nextInt();
			 int alphabet=64;
			 int i,j;
			 for(i=1;i<=n;i++)
			 {
				 for(j=i; j>=1; j--)
				 { 
			       System.out.print((char)(alphabet+i)+" ");
				 }
				 System.out.println();
			 }
    }
}