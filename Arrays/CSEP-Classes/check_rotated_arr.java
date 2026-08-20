import java.util.*;
public class check_rotated_arr {
    public static int[] rotated(int[] a,int rot,int n)
    {
        int k=rot%a.length;
        int b[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            b[(i+k)%n]=a[i];
        }
        return b;
    }
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
        int b[]= new int[n];
        b=rotated(a, rot, n);
        int half1[]=new int[k];
        int half2[]=new int[n-k];
       for(int i=0;i<k;i++)
        {
            half1[i]=b[i];
        }

        for(int i=k;i<n;i++)
        {
            half2[i-k]=b[i];
        }
        if(ascending(half1)==true && ascending(half2) || descending(half1)==true && descending(half2))
        System.out.println("rotated sorted array");
        else
        System.out.println("Not a rotated sorted array");

    }
    
}
