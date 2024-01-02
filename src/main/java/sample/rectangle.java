package sample;

public class rectangle{
    int length;
    int breadth;
    void area(int l,int b){
        length=l;
        breadth=b;
        System.out.println("area of rectangle is"+(length*breadth));
    }


    public static void main(String args[]){
         rectangle r1=new rectangle();
         r1.area(77,99);

    }
}
