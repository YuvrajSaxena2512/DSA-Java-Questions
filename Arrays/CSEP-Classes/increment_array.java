import java.util.*;
public class increment_array
{
    public static void value_up_or_down(int[] a,int n)
    {
            for(int i=0;i<a.length;i++)
            {
                a[i]=a[i]+n;
            }
            System.out.println("New Array");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Arrsy");
        int size= sc.nextInt();
        int a[]= new int[size];
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<size;i++)
            {
                a[i]=sc.nextInt();
            }
        System.out.println("Enter the Value By which you increase or decrease the value");
        int n=sc.nextInt();
        value_up_or_down(a,n);
        
    }
}