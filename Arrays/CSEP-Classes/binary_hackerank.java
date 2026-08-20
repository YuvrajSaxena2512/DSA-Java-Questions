import java.io.*;
import java.util.*;

public class binary_hackerank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int x=sc.nextInt();
        int l=0,u=n-1,mid=0,flag=0;
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if(a[mid]==x)
            {
                System.out.println(mid);
                flag=1;
                break;
            }
            else if(x<a[mid])
            {
                u=mid-1;
            }
            else
            {
                l=mid+1;
            }
            
        }
        System.out.println(l);
        
    }
}