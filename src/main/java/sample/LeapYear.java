package sample;

public class LeapYear {
    public static void main(String args[]){
        int year=2023;
        if(year%4==0){
            System.out.println("Year is a leap year");
        }
        else if(year%4!=0){
            System.out.println("Year is not a leap year");
        }
    }
}
