import java.util.*;
public class delOccuranceChar
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();//Naveen
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==Character.toUpperCase(str.charAt(j))
                ||str.charAt(i)==Character.toLowerCase(str.charAt(j)))
                count++;
            }
            if(count==1)
            System.out.print(str.charAt(i));
        }
    }
    
}
