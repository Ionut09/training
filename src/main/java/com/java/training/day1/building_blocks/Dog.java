package com.java.training.day1.building_blocks;

public class Dog {

    int age;     //0     variabila de instanta          //2
    public String name;  //null
    static int numberOfLegs; // variabila statica
    //this is an instance initializer
    {
        //1
        System.out.println("inside instance initializer block");
        age = 6;
    }

    static{
        //System.out.println("in static block" + name);
    }

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }
    public Dog(){
        //3
        this(1, "Doggie"); //must be first statement
        System.out.println("In Dog constructor");
    }
    void methodInDog(){
        System.out.println("Dog class method");
    }

    static void howManyLegs(){
//        methodInDog();
//        System.out.println(age);
        System.out.println("numberOfLegs --> " + numberOfLegs);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
