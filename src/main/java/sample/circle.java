package sample;
//2*3.14*radius
public class circle {
    int radius;
    float F;
    int i;
    void perimeter(int r,float F,int i){
        r=1;
        i=2;
        F=3.14f;
        System.out.println("perimeter of circle is"+(2*3.14f*1));
    }
    public static void main(String args[]){
        circle p1=new circle();
        p1.perimeter(1,3.14f,2);
    }
}
