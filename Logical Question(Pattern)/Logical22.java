import java.util.Scanner;
class Logical22
{
 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print("1 ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
   }
}