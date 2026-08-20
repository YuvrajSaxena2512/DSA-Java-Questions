import java.util.*;
public class spiral {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int a[][]= new int[n][n];
        int element=1,start=0,stop=n-1;
        while(element<=n*n)
        {
            for(int i=start,j=start;j<=stop;j++)
                a[i][j]=element++;
            for(int i=start+1,j=stop;i<=stop;i++)
                a[i][j]=element++;
            for(int i=stop,j=stop-1;j>=start;j--)
                a[i][j]=element++;
            for(int i=stop-1,j=start;i>start;i--)
                a[i][j]=element++;

            start++;
            stop--;
        }
    for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
                {
                    System.out.print(a[r][c]+"\t");
                }
            System.out.println();
        }
}}
