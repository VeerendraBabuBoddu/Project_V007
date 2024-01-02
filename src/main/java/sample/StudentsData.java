package sample;

public class StudentsData {
    int id=007;
    String name="Veeru";
    int age=25;
    void Data(int id,String name){
        System.out.println(id);
        System.out.println(name);
    }
    void Data(int id,String name,int age){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[]){
        StudentsData s1=new StudentsData();
        s1.Data(007,"Veeru");
        StudentsData s2=new StudentsData();
        s2.Data(007,"Veeru",25);
    }
}
