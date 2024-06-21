import java.util.*;
// class newlist{
//     static list insert(int n,list list1)
//     {
//         list1.add(n);
//     }
// }
public class listDataStructure {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
      //  newlist list=new newlist();
        int value,pos;
        while(true){
            System.out.println("---------------------------------");
            System.out.println("press 1 insert the value:\npress 2 delete the value:\npress 3 display the list:\npress 4 insert specific position :");
            System.out.println("press 5 Delete form specific position:\npress 6 exit:");
            System.out.println("---------------------------------");
            int num=input.nextInt();
            switch(num){
                case 1:
                System.out.println("insert value:");
                value=input.nextInt();
                list.add(value);
                break;
                case 2:
                System.out.println("delete value:");
                value=input.nextInt();
                list.remove(value);
                break;
                case 3:
                System.out.println(list);
                break;
                case 4:System.out.println("insert specific position value:");
                value=input.nextInt();
                pos=input.nextInt();
                list.add(pos,value);
                break;
                case 5:System.out.println("delete specific position value:");
                value=input.nextInt();
                pos=input.nextInt();
                list.remove(pos);
                break;
                case 6:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid number");
                break;
            }
        }
    }
}
