import java.util.*;
public class array_sum_product
{
    public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n= sc.nextInt();
            int sum=0, p=1;
            int arr[]= new int[n];
            System.out.println("Enter the values in array");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
                if(i%2==0)
                    sum+=arr[i];
                else
                    p*=arr[i];
            }
            System.out.println("Sum of even indexed term :"+sum+"\nProduct of odd indexed term:"+p);

        }
}
