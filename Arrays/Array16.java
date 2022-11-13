class Array16
{
public static void main(String args[])
{ 
      int [] a1 ={45,67,88,33,77};
      int [] a2 ={47,6,88,36,79};
	  for(int i =0;i<a1.length;i++)
	  {
		  for(int j=0;j<a2.length;j++)
		  {
			  if(a1[i]==a2[j])
			  {
				  System.out.println(a2[j]);
			  }
		  }
		  
	  }
  }
}
	  