package Inheritance;

public class Barclays extends RBOE{
    float homeinterestrate(){
    return 0.35f;
}
    public static void main(String args[]){
        Barclays B=new Barclays();
        B.homeinterestrate();
        System.out.println(B.homeinterestrate()+" "+"Homeinterestrate is greater then RBOE by 0.05%");
    }
}


