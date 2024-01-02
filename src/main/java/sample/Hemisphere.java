package sample;

public class Hemisphere {
    int r;
    int r1;
    int r2;
    float F1;
    float F2;
    void volume(int r,int r1,int r2,float F1,float F2){
        r=r1=r2=7;
        F1=3.14f;
        F2=2/3f;
    System.out.println("volume of hemisphere is"+(2f/3)*3.14f*7*7*7);
    }
    public static void main(String args[]){
        Hemisphere h1=new Hemisphere();
        h1.volume(7,7,7,3.14f,(2f/3));
    }
}
