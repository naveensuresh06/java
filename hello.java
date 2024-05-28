
import java.util.*;
public class hello {
	public static void main(String args[])
	{
		try (Scanner input = new Scanner(System.in)) {
            int bnum=input.nextInt();  //1011101
            int count=0,rem;
            double ans=0;
            while(bnum!=0) 
            {
            	rem=bnum%10;
            	bnum=bnum/10;
            	ans += rem*Math.pow(2,count);
            	++count;
            }
            System.out.print(ans);
        }
	}

}
