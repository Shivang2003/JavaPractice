package org.example;

public class OopsConcepts {

    static class Dog{
        Dog(){
            System.out.println("default constructor called using this");
        }
        int a;
        String s;
        int m;
        String d;
        Dog(int a, String s){
            this();
            this.a = a;
            this.s = s;
            m=a;
            d=s;
        }
        void display(){
            System.out.println(a);
            System.out.println(s);
            System.out.println(m);
            System.out.println(d);

        }
    }
    static class Cat{
        int a;
        String s;
        Cat(Dog doberman){
            this.a = doberman.a;
            this.s = doberman.s;
        }
        void display(){
            System.out.println(a);
            System.out.println(s);}

    }
    public static void main(String[] args) {
        Dog ob1 = new Dog(12,"german");
        ob1.display();
        Cat ob2 = new Cat(ob1);
        ob2.display();
        final Integer a;
    }
}
