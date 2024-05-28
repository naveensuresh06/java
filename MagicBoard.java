import java.util.*;
public class MagicBoard {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=0;i<4;i++)
        {
            int n=input.nextInt(); 
            num.add(n);
        }
        for(int i=0;i<4;i++)
        {
            int a=num.get(i);
            char c=(char)a;
            System.out.println(a+"-"+c);
        }       
            }
        }
