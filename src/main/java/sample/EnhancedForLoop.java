package sample;

public class EnhancedForLoop {
    public static void main(String args[]) {
    //String array[]={"veeru","sandhya"};
        String array[]=new String[2];
        array[0]="veeru";
        array[1]="sandhya";
        for (String str:array) {
        System.out.println(str);
        }
    }
}
