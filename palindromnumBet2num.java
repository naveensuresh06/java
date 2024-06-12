import java.util.*;
public class palindromnumBet2num {
    static int palindrom(int i)
    
    {
        int ans=0;
        while(i!=0)
        {
            int rem=i%10;
            ans=(ans*10)+rem;
            i=i/10;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int st=input.nextInt(),end=input.nextInt();
        for(int i=st;i<=end;i++)
        {
            if(i==palindrom(i))
            System.out.print(i+" ");
        }
    }
    
}
