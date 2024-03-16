package lectorial02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Cat();
//        Animal myCat = new Cat();
//        myCat.makeSound();
//
//        Animal myDog = new Dog();
//        myDog.makeSound();

        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Cat());
        myAnimals.add(new Dog());
        myAnimals.add(new Elephant());

        for(Animal animal: myAnimals){
            animal.makeSound();
        }


        ArrayList<Feedable> things = new ArrayList<>();
        things.add(new Plant());
        things.add(new Cat());
        things.add(new Elephant());

        for(Feedable thing: things){
            thing.feed();
        }

    }
}
