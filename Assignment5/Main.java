package Learnmaxxing.Assignment3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("janaa");
        System.out.println("name : "+person1.name);
        Person person2 = new Person("siddharth",18);
        System.out.println("name : "+person2.name+" | age : "+person2.age);
        Person person3 = new Person("abinesh",17,"Zoho Campus");
        System.out.println("name : "+person3.name+" | age : "+person3.age+" | address : "+person3.address);
    }
}

