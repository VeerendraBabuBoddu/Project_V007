package sample;

public class LablelForLoop {
    public static void main(String args[]){
        aa:
        for(int i=3;i<10;i++){
            bb:
            for(int j=5;j<10;j++){
                if(i==4&&j==8)
                    break bb;
            System.out.println(i+" "+j);
        }
        }

        System.out.println("just added");

    }

}

