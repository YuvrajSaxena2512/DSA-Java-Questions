import java.io.*;
import java.util.*;

public class rotated {
    public static int dip_point(int []a)
    {
        int dip=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                dip=i+1;
            }
        }
        return dip;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int k=0;
        int dip=dip_point(a);
        if(dip==0)
        {
            System.out.println(k);
            return;
        }
        for(int i=dip;i<n;i++)
        {
            k=k+1;
        }
        System.out.println(k);
    }
}