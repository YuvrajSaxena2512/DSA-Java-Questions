//Lower Bound = first element >= target
//Upper Bound = first element > target


import java.util.*;
public class lower_upper_bound
{
    public static int lower_bound(int[]a,int target)
    {
        int l=0,u=a.length-1,lower=0,mid=0;
        while(l<=u)
        {
            mid=(u+l)/2;
            if(a[mid]>=target)
            {
                lower=mid;
                u=mid-1;
            }
            else
                l=mid+1;
        }
        return lower;
    }    
    public static int upper_bound(int[]a,int target)
    {
        int l=0,u=a.length-1,upper=0,mid=0;
        while(l<=u)
        {
            mid=(u+l)/2;
            if(a[mid]>target)
            {
                upper=mid;
                u=mid-1;
            }
            else
                l=mid+1;
        }
        return upper;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Target");
        int target=sc.nextInt();
        int occur_pos[]=new int[2];
        occur_pos[0]=lower_bound(a, target);
        occur_pos[1]=upper_bound(a, target);
        System.out.println("Occurence Position");
        for(int i=0;i<=1;i++)
        {
            System.out.println(occur_pos[i]);
        }
    
    }    
}
