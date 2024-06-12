import java.util.*;
public class findtheAutoCount {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        int ans=0,a=0;
        for(int i=0;i<s.length();i++)
        {
            int n=s.charAt(i)-'0';
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)-'0'==i)
                c++;
            }
            if(c!=n){
                a++;
                break;
            }
            else
            {
                int count=0;
                for(int k=i;k<s.length();k++)
                {
                    if(n==s.charAt(k)-'0')
                    count++;    
                }
                if(count==1)
                ans++;
            }
        }  
        if(a>0)
        System.out.println(0);
        else
        System.out.print(ans);
    }
    
}
