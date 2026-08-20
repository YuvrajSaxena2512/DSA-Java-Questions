import java.util.*;
public class string_basic
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(s.length());
        String s1="";
        System.out.println(2*3+65/5 + " " + 1+2+3+4+5+"hello \" \n \" boy");
        String vowel="aeiouAEIOU";
        int v=0,con=0;
        for(int i=0;i<s.length();i++)
        {
        char ch=s.charAt(i);
        if(vowel.indexOf(ch)>=0)
        v++;
        else
            con++;
        }}


}