import java.util.Scanner;
class Logical9
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int i, j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
			  System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
				System.out.println();
		}
             for(i=n;i>=1;i--)
		   {
			  for(j=2;j<i;j++)
			   {
			     System.out.print(" ");
			    }
			  for(j=i-1;j<=n;j++)
			    {
				  System.out.print(j+" ");
			     }
				System.out.println();
		   }
  }
}