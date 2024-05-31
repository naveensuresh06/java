import java.util.*;
public class sumOfDivisibleNum {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt(),e=input.nextInt();
        int sum=0;
        for(int i=s;i<=e;i++)
        {
            if(i%3==0 && i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
