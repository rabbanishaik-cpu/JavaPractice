package PracticeCodes;
public class SuperKeyword {
    String color = "White";
    SuperKeyword(){
        System.out.println("I am parent class Constructor");
    }
    void foo(){
        System.out.println("i am parent class method");
    }
}
class Cat extends SuperKeyword{
    String color = "black";
    Cat(){
        super();
        System.out.println("I am child class constructor");
    }
    void printColor(){
        System.out.println(color);
        //here it fetched the parent class variable
        System.out.println(super.color);
        //here I am calling parent class method using super keyword
        super.foo();
    }
}
class printColor{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printColor();
    }
}