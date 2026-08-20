// when rotating is K=1
import java.util.*;
public class rotate_arraypart1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Rotate value");
        int k= sc.nextInt();
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        int temp=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;
        System.out.println("New Array");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}