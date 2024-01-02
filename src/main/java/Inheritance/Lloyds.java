package Inheritance;

public class Lloyds extends RBOE{
    float homeinterestrate(){
        return 0.25f;
    }
    public static void main(String args[]){
        Lloyds L=new Lloyds();
        L.homeinterestrate();
        System.out.println(L.homeinterestrate());
    }
}
