import java.util.Scanner;
class Logical21
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else 
			 System.out.print("1");
			}
			System.out.println();
		}
 }
}