class Array17
{
public static void main(String args[])
 {    
      int sum=0;
      int a[] = new int[101];
    for(int i=1;i<a.length;i++)
	{
		if(i==55)
		continue;
		a[i]=i;
		System.out.print(a[i]+" ");
	}
	int exp_no_of_element= a.length;
	int total_sum= (exp_no_of_element*(exp_no_of_element-1))/2;
	System.out.println("total sum :"+total_sum);
	
	for(int i=1;i<a.length;i++)
	{
		sum= a[i]+sum;
		 
	}
	System.out.println("Missing no is :"+(total_sum-sum));
 }
}
 
       