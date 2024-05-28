import java.util.*;
public class PasswordChekerAccenture3 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int cap=0,num=0,extra=0,spec=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(0)>='0'&&str.charAt(0)<='9'||str.length()==0||str.length()<4)
            {
                extra++;
                break;
            }
            else if(str.charAt(i)==' '||str.charAt(i)=='/')
            {
                spec++;
                break;
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                cap++;
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                num++;
        }
        if(extra==1||spec==1||cap==0||num==0)
        System.out.print("0");
        else if(cap>=1&&num>=1)
        System.out.print("1");
    }   
}
