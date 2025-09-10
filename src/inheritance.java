class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("This dog barks");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Dog d= new Dog();
        Animal a = new Animal();
        d.bark();
        d.eat();
        a.eat();
    }
}