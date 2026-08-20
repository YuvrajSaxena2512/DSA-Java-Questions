import java.util.*;
public class largest 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n= sc.nextInt();
            int max=-1;
            
            int arr[]= new int[n];
            System.out.println("Enter the values in array");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
                if(max<arr[i])
                {
                    max=arr[i];
                }
              
                
    }
    System.out.println("LARGEST Number in Array"+max);
}
}

