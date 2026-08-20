import java.util.*;
public class average_near {
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
        int avg=0,sum=0;
        for(int i=0;i<size;i++)
            {
                sum+=a[i];
            }
        avg=sum/size;
        System.out.println("Greater than Average");
        for(int i=0;i<size;i++)
        {
            if(a[i]>=avg)
            {
                System.out.println(a[i]);
            }
        }
    }
}
