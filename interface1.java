interface vehicle{
     void ride();
}
interface brand{
     void brand();
}
class bike implements vehicle,brand{
    public void ride(){System.out.println("bike is a vehicle");}
    public void brand(){System.out.println("Honda bike is a vehicle");}
}
public class interface1 {
    public static void main(String args[])
    {
        bike a=new bike();
        a.ride();
    }
}
