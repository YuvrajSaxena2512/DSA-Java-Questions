import java.util.*;
public class rotated_sorted_binary
{
    public static int dip_point(int []a)
    {
        int dip=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                dip=i+1;
            }
        }
        return dip;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements for rotated sorted Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        System.out.println("Enter Element to be searched");
        int target=sc.nextInt();

        int start=0;
        int low=dip_point(a);
        int high=n-1;
        int mid=0;

        int flag_1=0;

        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(a[mid]==target)
            {
                System.out.println("Number found at :"+mid);
                flag_1=1;
                break;
            }
            else if (a[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        int flag_2=0;
        int end=dip_point(a)-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(a[mid]==target)
            {
                System.out.println("Number found at :"+mid);
                flag_2=1;
                break;
            }
            else if (a[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        if(flag_1==0 && flag_2==0)
            System.out.println("Number not found");

    }
}