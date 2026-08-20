import java.util.*;
public class second_largest_array {
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
        int max=-1,sec_max=-1;
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                sec_max=max;
                max=a[i];

            }
            else if(a[i]>sec_max && a[i]<max)
            {
                sec_max=a[i];
            }
            else{
            continue;
            }
        }
        System.out.println("Seconf Largest Element : "+sec_max);
        
    }
    
}
