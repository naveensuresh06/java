import java.util.*;
public class list {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        ArrayList<String> li=new ArrayList<>();
        ArrayList<String> li2=new ArrayList<>();
        String a[]={"Black","White","Blue","Purple","Pink","Yellow"};
        for(String i:a){
            li.add(i);
        }
        System.out.println(li);
        String a2[]={"A","B","C","D","E","F","G"};
        for(String i:a2){
            li2.add(i);
        }
        System.out.println(li2);
        // for(String i:li)
        // System.out.println(i);
        li.add(0,"Green");
        // li.set(3,"blue");
        // li.add(3,"Blue");
        // li.remove(3);
        // System.out.println(li.contains("Pink"));
        // System.out.println(li);
        Collections.sort(li);
        Collections.copy(li,li2);
        System.out.println(li);
        //Collections.shuffle(li2);
        Collections.reverse(li2);
        System.out.println(li2);
        // System.out.println(li.get(0));
        
    }
    
}
