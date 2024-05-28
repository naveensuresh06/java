import java.util.*;
public class NumberOfCarriesAccenture10 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int n=Math.max(num1,num2);
        int r,r1;
        int count=0;
        while(n!=0)
        {
            r=num1%10;
            r1=num2%10;
            num1=num1/10;
            num2=num2/10;
            n=n/10;
            if((r+r1)>=10)
                count++;
            num1=num1+1;
        }
        System.out.print(count);
    }
    
}
