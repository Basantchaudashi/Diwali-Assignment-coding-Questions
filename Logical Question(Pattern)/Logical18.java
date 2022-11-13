import java.util.Scanner;
class Logical18
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		
		int i, j;
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
  }
}