import java.util.*;
public class ternaryop {
    public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) {
            int num=input.nextInt();
            int result = num%2==0 ? 10:20;
            System.out.println(result);
        }
    }
    
}
