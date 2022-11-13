
class Array9
{
	public static void main(String args[])
	{
		
		int a[] = new int[7];
		for(int i=1;i<a.length;i++)
		{
		 if(i%2!=0)
		   {
			 a[i]=i*i*i;
		   }
		 if(i%2==0)
		   {
			 a[i]=i*i;
		   }
		 System.out.print(a[i]+" ");
	   }
	}
	     
}
