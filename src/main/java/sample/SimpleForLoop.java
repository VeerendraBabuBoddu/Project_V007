package sample;

public class SimpleForLoop {
    public static void main(String args[]) {
        for (int age1 = 25; age1 <= 30; age1++) {
           // System.out.println(age1);
//Nested forloop can be done
             for (int age2 = 27; age2 <=30 ; age2++) {
               System.out.println(age1+" "+age2);
            }
        }
    }
}
