import java.util.*;
public class firstandlast
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
        if(rev.equals(s))
        System.out.println("Palindrone String");
        else
            System.out.println("Not a Palindrone");

    }
}