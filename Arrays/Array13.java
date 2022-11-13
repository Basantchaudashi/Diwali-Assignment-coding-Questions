import java.util.Arrays; 
class Array13
{
public static void main(String[] args)   
    {      
      int[] a = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
 
        Arrays.sort(a);   
        System.out.println("Elements of array sorted in ascending order: ");  
  
      for (int i = 0; i < a.length; i++)   
         {       
            System.out.println(a[i]);   
            }   
    }  
}  