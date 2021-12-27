package Kuis;

import java.util.LinkedList;

class Person { // Ferdhy Ihza Armanda 205150401111011

    private final String name;
    private final int age;
    private final double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}

public class Nomor1 {

    public static void main(String[] args) {

        LinkedList<Person> ll = new LinkedList();
        Person p1 = new Person("Fred",34,1.7);
        ll.add(p1);
        Person p2 = new Person("Sue",27,1.2);
        ll.add(p2);
        Person p3 = new Person("Joe",48,1.4);
        ll.add(p3);
        Person p4 = new Person("Zoe",30,1.3);
        ll.add(p4);
        for (Person p : ll) {
            System.out.println("-------------------");
            System.out.println("Index   : " + ll.indexOf(p));
            System.out.println("Name    : " + p.getName());
            System.out.println("Age     : " + p.getAge());
            System.out.println("Height  : " + p.getHeight());
            System.out.println("-------------------");
        }

    }
}



