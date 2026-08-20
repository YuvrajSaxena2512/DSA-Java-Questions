import java.util.*;
public class missing_number {
    public static boolean is_missing(int []numbers,int i)
    {
        int flag=0;
        for(int j=0;j<numbers.length;j++)
        {
            if(numbers[j]==i){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Arrsy");
        int size= sc.nextInt();
        int numbers[]= new int[size];
        System.out.println("Enter Elements in the Array");
        for(int i=0;i<size;i++)
            {
                numbers[i]=sc.nextInt();
            }
          
        if (numbers.length == 0) return;

        int min = numbers[0];
        int max = numbers[0];

        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; 
            }
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }
        int k=0;
        int missing[]= new int[100];
        for(int i=min;i<=max;i++)
        {
            if(is_missing(numbers, i)==true)
            {
                missing[k++]=i;
            }
        }
        System.out.println("Missing Elements ");
        for(int i=0;i<k;i++)
        {
            System.out.println(missing[i]);
        }

    }
}