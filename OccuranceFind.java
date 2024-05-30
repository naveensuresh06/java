import java.util.*;
public class OccuranceFind {
    public static int find(int k,int i)
    {
        int c=0;
        while(i!=0){
            int rem=i%10;
            if(rem==k)
            c++;
            i=i/10;
        }
        return(c);
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int in=input.nextInt();
        int en=input.nextInt();
        int count=0;
        for(int i=in;i<=en;i++)
        {
            int num=find(k,i);
            if(num>0)
            {
                count=count+num;
            }
        }
        System.out.println(count);
    }
    
}
