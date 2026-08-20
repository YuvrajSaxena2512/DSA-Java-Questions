/*INSERTION AT THE REAR OR END

import java.util.*;
public class insertion_array
{
    public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size of The array");
            int n= sc.nextInt();
            int a[]=new int[n+1];
            System.out.println("Enter Elements to be inserted in the Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter number to be inserted at the end");
            int num=sc.nextInt();
            a[n]=num;
            for(int i=0;i<=n;i++)
            {
                System.out.println(a[i]);
            }
        }

} */

/*INSERTION AT ANY POSITION


import java.util.*;
public class insertion_array
{
    public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size of The array");
            int n= sc.nextInt();
            int a[]=new int[n+1];
            System.out.println("Enter Elements in the Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter number to be inserted");
            int num=sc.nextInt();
            System.out.println("Enter position for insertion");
            int pos=sc.nextInt();
            for(int i=a.length-1;i>pos;i--)
            {
                a[i]=a[i-1];
                if((i-1)==pos)
                {
                    a[i-1]=num;
                }
            }
            System.out.println("New Array");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }
    }


    */


/*AT THE FRONT 
import java.util.*;
public class insertion_array
{
    public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size of The array");
            int n= sc.nextInt();
            int a[]=new int[n+1];
            System.out.println("Enter Elements in the Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter number to be inserted at the front");
            int num=sc.nextInt();
            for(int i=a.length-1;i>0;i--)
            {
                a[i]=a[i-1];
                if((i-1)==0)
                {
                    a[i-1]=num;
                }
            
            }
            System.out.println("New Array");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }

        }}

 */