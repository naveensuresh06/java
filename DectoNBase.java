import java.util.*;
public class DectoNBase {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int div=input.nextInt();
        int rem=0;
        String st="";
        char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D',
        'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Z'};
        while(div>0)
        {
            rem=div%n;
            div=div/n;
            st=arr[rem]+st;
        }
        System.out.println(st);
        }
}
