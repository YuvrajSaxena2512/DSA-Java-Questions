import java.util.*;
public class selection_sort {
    
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter size of Array");
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            int temp=0,key=0;
            for(int i=1;i<n;i++)
            {
                key=i-1;
                for(int j=i;j<n;j++)
                {
                    if(a[key]>a[j])
                    {
                        temp=a[key];
                        a[key]=a[j];
                        a[j]=temp;
                    }
                }
            }
            System.out.println("New array ");
            for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }





        }}