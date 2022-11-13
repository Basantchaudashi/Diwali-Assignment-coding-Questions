import java.util.Scanner;
class Logical12
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int alphabet =64;
		int i, j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
			{
			  System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(alphabet+j)+" ");
			}
				System.out.println();
		}
  }
}