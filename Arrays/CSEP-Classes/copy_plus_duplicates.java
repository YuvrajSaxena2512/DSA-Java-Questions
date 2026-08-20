import java.util.*;
class copy_plus_duplicates
{
    public static void copy(int[] arr)
    {
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Arrsy");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        int count[]= new int[10];
        for(int i=0;i<n;i++)
        {
            int value=a[i];
            count[value]= count[value]+1;
        }
        int duplicate[]= new int[10];
        int k=0;
        for(int i=0;i<10;i++)
        {
            if(count[i]>1)
            {
                duplicate[k++]=i;
            }
        }

        System.out.println("Duplicate elements");
        for(int i=0;i<k;i++)
        {
            System.out.println(duplicate[i]);
        }
    }
}