package Inheritance;

public class Natwest extends RBOE{
    float homeinterestrate(){
        return 0.20f;
    }
    public static void main(String args[]){
        Natwest N=new Natwest();
        N.homeinterestrate();
        System.out.println(N.homeinterestrate());
    }
}
