import java.util.*;
public class first_last_occur 
{
    public static int first_occur(int[]a,int target)
    {
        int l=0,u=a.length-1,first=0,mid=0;
        while(l<=u)
        {
            mid=(u+l)/2;
            if(a[mid]==target)
            {
                first=mid;
                u=mid-1;
            }
            else if(a[mid]>target)
                u=mid-1;
            else
                l=mid+1;
        }
        return first;
    }    
    public static int last_occur(int[]a,int target)
    {
        int l=0,u=a.length-1,last=0,mid=0;
        while(l<=u)
        {
            mid=(u+l)/2;
            if(a[mid]==target)
            {
                last=mid;
                l=mid+1;
            }
            else if(a[mid]>target)
                u=mid-1;
            else
                l=mid+1;
        }
        return last;
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
        occur_pos[0]=first_occur(a, target);
        occur_pos[1]=last_occur(a, target);
        System.out.println("Occurence Position");
        for(int i=0;i<=1;i++)
        {
            System.out.println(occur_pos[i]);
        }
    
    }    
}
