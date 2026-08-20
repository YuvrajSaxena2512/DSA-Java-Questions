/*
DELETION AT THE END

import java.util.*;
public class deletion_array
{
     public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size of The array");
            int n= sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter Elements in the Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            n=n-1;
            System.out.println("New Array");
            for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }

        }

    
}
*/


/*  DELETION AT ANY POSITION 
import java.util.*;
public class deletion_array
{
     public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size of The array");
            int n= sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter Elements in the Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter position for deletion");
            int pos=sc.nextInt();
            for(int i=pos;i<n-1;i++)
            {
                a[i]=a[i+1];
            }
            n=n-1;
            System.out.println("New Array");
            for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }

        }}

*/


/*  DELETION AT FRONT */
import java.util.*;
public class deletion_array
{
     public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter The Size of The array");
            int n= sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter Elements in the Array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
            for(int i=0;i<n-1;i++)
            {
                a[i]=a[i+1];
            }
            n=n-1;
            System.out.println("New Array");
            for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }

        }}

