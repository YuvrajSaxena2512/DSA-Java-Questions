// when rotating is K=n
import java.util.*;
public class rotate_arraypart2
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
        int temp[]=new int[k];
        int g=0,h=n-1;

        for(int i=0;i<k;i++)
        {
            temp[g++]=a[h--];
        }

        for(int j=0;j<k;j++)
        {
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }}
        int z=0,y=0;
        for(int i=0;i<k;i++)
        {
            a[z++]=temp[y++];
        }
        
        System.out.println("New Array");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}