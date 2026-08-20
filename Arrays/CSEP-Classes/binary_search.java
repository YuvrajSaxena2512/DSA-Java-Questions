import java.util.*;
public class binary_search {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a value to be search");
        int value=sc.nextInt();
        int l=0,u=n-1,mid=0,c=0;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(a[mid]==value)
            {
                System.out.println("Number Found  !!! at index : "+mid);
                c=1;
                break;
            }
            else if(a[mid]>value)
            {
                u=mid-1;
            }
            else
                l=mid+1;
        }
        if(c==0)
        System.out.println("Not Found");
    }
}
