import java.util.Scanner;
class Logical3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		     int n = sc.nextInt();
			 int i,j;
			 int count=0;
			 for(i=1; i<=n;i++)
			 {
				 for(j=1;j<=i;j++)
				 {
					 count++;
					 System.out.print(count+" ");
				 }
				 System.out.println();
			 }
	}
}