package Pertemuan2a;

class Student{
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Name\t\t\t : " + student.name);
        System.out.println("Age\t\t\t\t : " + student.age);
        System.out.println("Is science major : " + student.isScienceMajor);
        System.out.println("Gender\t\t\t : " + student.gender);
    }
}
