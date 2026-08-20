import java.io.*;
import java.util.*;

public class array_bridge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int ls=0,rs=0,flag=0;
        for(int i=0;i<n;i++)
        {
            rs=0;ls=0;
            for(int j=i;j<n-1;j++)
            {
                rs=rs+a[j+1];
            }
            for(int k=i;k>0;k--)
            {
                ls=ls+a[k-1];
            }
            if(rs==ls)
            {
                flag=1;
                System.out.println(i);
                break;
            }
            
        }
        if(flag==0)
        System.out.println(-1);
        
    }
}