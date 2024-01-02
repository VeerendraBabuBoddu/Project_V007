package sample;
//3.14f*radius*radius*height
//r=r1
public class cylinder {
    int r;
    int r1;
    int h;
    float F;
    void volume(float F,int r,int r1,int h){
        F=3.14f;
        r=45;
        r1=45;
        h=67;
        System.out.println(3.14*45*45*67);
    }
    public static void main(String args[]){
        cylinder c1=new cylinder();
        c1.volume(3.14f,45,45,67);
    }
}
