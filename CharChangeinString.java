import java.util.*;
public class CharChangeinString {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char ch=input.next().charAt(0);
        char ch1=input.next().charAt(0);
        String s="";
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
            s=s+ch1;
            c++;
            }
            else if(str.charAt(i)==ch1)
            {
            s=s+ch;
            c++;
        }
            else
            s=s+str.charAt(i);
        }
        if(str.length()==0)
        System.out.println("null");
        else if(c<1)
        System.out.println("not change");
        else
        System.out.println(s);
    }
    
}
