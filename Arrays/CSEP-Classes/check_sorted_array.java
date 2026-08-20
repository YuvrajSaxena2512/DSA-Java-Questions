import java.util.*;
public class check_sorted_array {
    public static boolean ascending(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                continue;
            }
            return false;
        }
        return true;

    }
    public static boolean descending(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                continue;
            }
            return false;
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Arrsy");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        if(ascending(a))
        {
            System.out.println("Array is in Ascending Order");
        }
        else if (descending(a))
        {
            System.out.println("Array is in Descending Order");
        }
        else
        {
            System.out.println("Unsorted Array input");
        }


    }
    
}
