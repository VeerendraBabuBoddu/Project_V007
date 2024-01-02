package Seleniumsample;

public class UnCheckedException {
         static void checkage(int age) {
         if (age < 18) {
             throw new ArithmeticException("Person is not authorised");
         }
         else {
             System.out.println("Person is authorised");
         }
     }
    public static void main(String args[]){
    checkage(13);

     }
    }
