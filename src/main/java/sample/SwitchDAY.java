package sample;

public class SwitchDAY {
    public static void main(String args[]){
        String day="SATURDAY";
        switch (day){
            case "Sunday":
                System.out.println("Day one is sunday");
                break;
            case "MONDAY":
                System.out.println("Day two is monday");
                break;
            case "WEDNESDAY":
                System.out.println("Day three is wednesday");
                break;
            case "THURSDAY":
                System.out.println("Day four is thursday");
                break;
            case "FRIDAY":
                System.out.println("Day five is friday");
                break;
            case "SATURDAY":
                System.out.println("Day six is saturday");
                break;
            default:
                System.out.println("none of the days");
        }

    }

}
