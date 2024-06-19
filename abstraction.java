abstract class shape{
    String name;
    abstract void typeofshape();
}
class square extends shape{
    void typeofshape(){
        System.out.println("square is the shape");
    }
}
class triangle extends shape{
    void typeofshape(){
        System.out.println("triangle is the shape");
    }
}
public class abstraction {
    public static void main(String args[])
    {
        shape[] n=new shape[4];
        n[0]=new square();
        n[1]=new triangle();
        n[2]=new square();
        n[3]=new triangle();
        for(shape m: n){
            m.typeofshape();
        }


    }
    
}
