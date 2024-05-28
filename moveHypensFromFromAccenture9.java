import java.util.*;
public class moveHypensFromFromAccenture9 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='-'){
                str1='-'+str1;
            }else
            str1=str1+str.charAt(i);
        }
        System.out.print(str1);
    }
    
}
