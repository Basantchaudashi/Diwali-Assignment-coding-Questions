
class Array3
{
	public static void main(String args[])
	{
		
		int a[] = {6,4,16,8,2,7,1,3,9};
		int sum = 10;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					continue;
				}
		       if(a[i]+a[j]==sum)
		   
			System.out.println("("+a[i]+","+a[j]+")"+"="+sum);
			}
		}
	}
	     
}
