// when rotating is K=n
import java.util.*;
public class rotate_arraypart3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Rotate value");
        int rot= sc.nextInt();
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        int k=rot%a.length;
        int b[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            b[(i+k)%n]=a[i];
        }
        
        System.out.println("New Array");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}