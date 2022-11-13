
class Array5
{
	public static void main(String args[])
	{
		
		int a[] = {10,44,30,80,50,60};
		int large=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
		   
			  if(a[i]>large)
			  
				  large=a[i];
			  
			  if(a[i]<min)
			  {
				  min=a[i];
			  }
		}
		   System.out.print("large: "+large+"  "+"min: "+min);
		
	}
	     
}
