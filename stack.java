import java.util.*;
public class stack {
    static void prime(Stack<Integer> st,Stack<Integer> st2,int num)
    {
        int count=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            count++;
        }   
        if(count==0)
            st.push(num);
        else
            st2.push(num);
    }
        public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) {
            Stack<Integer> st=new Stack<Integer>();
            Stack<Integer> st2=new Stack<Integer>();
            int num=input.nextInt();
            for(int i=1;i<=num;i++)
            {
                prime(st,st2,i);
            }
            System.out.println(st);
            System.out.println(st2);
            System.out.println("stack 1: "+st.size()+" stack 2: "+st2.size());
        }
    }
    
}
