package sample;
public class Sketchpen {
    int no;
    String color;
    String flow;

    //void display(){
       // System.out.println(no);
        //System.out.println(color);
        //System.out.println(flow);
    //}

   // String color(){
     //   return "red";
    //}


    public static void main(String args[]){
        Sketchpen s1=new Sketchpen();
        Sketchpen s2=new Sketchpen();
        Sketchpen s3=new Sketchpen();

        s1.no=001;
        s1.color="green";
        s1.flow="vibrant";
        s2.no=002;
        s2.color=s1.color;
        s2.flow="laminar";
        s3.no=003;
        s3.color="yellow";
        s3.flow="Compressible";

        System.out.println(s1.no);
        System.out.println(s1.color);
        System.out.println(s1.flow);
        System.out.println(s2.no);
        System.out.println(s2.color);
        System.out.println(s2.flow);
        System.out.println(s3.no);
        System.out.println(s3.color);
        System.out.println(s3.flow);
//System.out.println(s3.color());
       // s1.display();
        //s2.display();
        //s3.display();
    }
}
