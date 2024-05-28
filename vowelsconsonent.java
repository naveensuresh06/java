import java.util.*;
public class vowelsconsonent {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        int cons=0, vowel=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'
                ||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
                ||s.charAt(i)=='O'||s.charAt(i)=='U')
            vowel++; 
            else
            cons++;    
        }
        System.out.println("vowels ="+vowel+"\nconsonent ="+cons);

    }
    
}
