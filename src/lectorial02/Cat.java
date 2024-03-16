package lectorial02;

public class Cat extends Animal implements Feedable{
    public void makeSound(){
        System.out.println("Meow");
    }

    public void feed(){
        System.out.println("Feed cat food!");
    }


}
