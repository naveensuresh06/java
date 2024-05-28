import java.util.*;
public class continued {
    public static void main(String args[])
    {
        try (Scanner input = new  Scanner(System.in)) {
            int num=input.nextInt();
            for(int i=0;i<num;i++)
            {
                if(i%2==0)
                continue;
                System.out.println(i);
            }
        }
    }
}
    

