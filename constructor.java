class box{
    int lenght;
    int breadth;
    int hight;
    int area;
    int dia;
    box(int l,int b,int h){
    lenght=l;
    breadth=b;
    hight=h;
    System.out.println("values of"+l + b + h);
    }
    box(int ar,int dia){
        area=ar;
        this.dia=dia;
}
}
public class constructor {
    public static void main(String args[])
    {
        box square=new box(4,6,8);
        box circle=new box(23,4);
        // square.box();
        System.out.println();
    }

    
}
