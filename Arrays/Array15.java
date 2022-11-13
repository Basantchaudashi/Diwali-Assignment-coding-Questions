
class Array15
{
    
    public static void main(String[] args)
    {
        int a[] = { 1, 3, 7, 5, 6, 2 };
        int n =a.length+1;
		int sum =0;
		int total_sum= (n*(n+1))/2;
		System.out.println("total sum :"+total_sum);
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		System.out.println("Missing no is :"+(total_sum-sum));
      
    }
}