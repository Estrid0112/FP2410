package lectorial02;

public class Elephant extends Animal implements Feedable{
    @Override
    public void makeSound() {
        System.out.println("Big sound");
    }

    public void feed(){
        System.out.println("Feed bananas/leaves");
    }
}
