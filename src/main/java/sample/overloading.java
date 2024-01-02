package sample;

public class overloading {
    int x=78;
    int y=97;
    int z=35;

    void sum(int x,int y){
        System.out.println("sum of two numbers is"+(x+y));
    }
    void subtract(int x,int y,int z){
        System.out.println("substraction of three numbers is"+(x-y-z));
    }
    void multiply(int x, int y, int z){
        System.out.println("multiplication of three numbers is"+(x*y*z));
    }
    public static void main(String args[]){
        overloading o1=new overloading();
        o1.sum(78,97);
        overloading o2=new overloading();
        o2.subtract(78,97,35);
        overloading o3=new overloading();
        o3.multiply(78,97,35);

    }


}
