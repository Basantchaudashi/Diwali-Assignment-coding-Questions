class Array18
{
public static void main(String args[])
{
   int a[] ={10,20,30,10,50,78};
   for(int i=0;i<a.length;i++)
   {
	  for(int j=i+1;j<a.length;j++)
        {
          if(a[i]==a[j]&&i!=j)
		  System.out.println("duplicate of element:"+a[i]);
        }
  
    }
}
}
		