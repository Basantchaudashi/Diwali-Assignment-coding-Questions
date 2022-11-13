class Array10
{
public static void main(String args[])
{ 
     int min=0;
   int a[] ={90,80,30,40,50,78};
   for(int i = 0;i<a.length;i++)
   {
	   System.out.print(a[i]+" ");
   }
   
   for(int i=0;i<a.length;i++)
     {
	   for(int j=i+1;j<a.length;j++)
	   {
	       if(a[i]>a[j])
	        {
		       min=a[i];
			   a[i]=a[j];
			   a[j]=min;
			}  
	    }
    }
	 System.out.println();
	 for(int i=0;i<a.length;i++)
        {
	      System.out.print(a[i]+" ");
        }
  }
}
		