import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int w[]=new int[n];
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        {
            w[i]=sc.nextInt();
        }
        int current_lead=w[n-1];
        int k=1;
        l[0]=current_lead;
        for(int i=n-2;i>=0;i--)
        {
           if(w[i]>current_lead)
           {
            current_lead=w[i];
            l[k++]=current_lead;
           } 
        }
        for(int i=k-1;i>=0;i--)
        {
            System.out.print(l[i]+" ");
        }
    }
}