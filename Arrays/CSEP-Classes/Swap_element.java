import java.util.*;
public class Swap_element {
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
            int temp=0;
        for(int i=0;i<size;i=i+2)
            {
                if(i==(size-1))
                {
                    a[i]=a[i];
                }
                else
                {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                }
            }
            System.out.println("New Array");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        


        }}
