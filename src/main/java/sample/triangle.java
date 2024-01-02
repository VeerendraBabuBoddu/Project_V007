package sample;
//0.5*base*height*length
public class triangle {
    int base;
    int height;
    int length;
    float F;
    void area(int l,int h){
        length=l;
        height=h;
        System.out.println("area of triangle is"+(length*height));
    }
    void volume(int h,int b,int l,float f){
        length=l;
        height=h;
        base=b;
        System.out.println("volume of triangle is"+b*(l*h)/2);
    }
    public static void main(String args[]) {
        triangle t1 = new triangle();
        t1.area(5, 6);
        t1.volume(6,5,7,2);

        }
        }


