import java.util.*;

public class half_array {
    public static void half(int[] a,int size)
    {
        System.out.println("New Array");
        for(int i=0;i<size;i++)
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
        if (size%2!=0)
        {
            size=size/2+1;
            half(a,size);
        }
        else
        {
            half(a, size);
        }
    }}