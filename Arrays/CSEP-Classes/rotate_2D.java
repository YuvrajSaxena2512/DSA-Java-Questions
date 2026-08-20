import java.util.*;
public class rotate_2D {
    public static int[][] rotate(int[][]a,int n)
    {
        int b[][]=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[j][(n-1)-i]=a[i][j];
            }
        }
    
        return b;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int a[][]= new int[n][n];
        System.out.println("Enter elements in arrray");
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
                {
                    a[r][c]=sc.nextInt();
                }
        }
        System.out.println("Enter rotation");
        int k=sc.nextInt();
        k=k%4;
        int b[][]= new int[n][n];
        for(int i=0;i<k;i++)
        {
        a=rotate(a, n);
        }
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
                {
                    System.out.print(a[r][c]+"\t");
                }
            System.out.println();
        }



    }
}
