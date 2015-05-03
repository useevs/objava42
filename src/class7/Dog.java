/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

import class8.FirstInterface;

/**
 *
 * @author shahzad
 */
public class Dog extends AnimalAbstract //extends Animal  
{

    String breed;

    public Dog() {
//        super("Dog");
//        this.breed = "Unknown";
        this("Unknown");
    }

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}' + super.toString();
    }

    @Override
    public String sound() {
        return "bark bark .... ";
    }

    public static void main(String[] args) {
        Dog d = new Dog("BullDog");
        Cat c = new Cat("Persian");
        AnimalAbstract a = new Dog("American");
//        Dog b = (Dog) new Animal("Dog") ;
        AnimalAbstract b = new Cat("Indian");
//        Cat e = (Cat) new Animal("Cat");
        AnimalAbstract e = new AnimalAbstract("Don't know") {
            @Override
            public String sound() {
                return "New Anonymous Sound ...";
            }

            @Override
            public void first() {
                System.out.println("First Anonymous ...");
            }
        }; //AnimalAbstract$1, $2, $3

        AnimalAbstract f = new BullDog();

//        System.out.println(c);
//        System.out.println(d);
        // Strong Polymorphism
        AnimalAbstract[] ar = {a, b, c, d, e, f};
        for (AnimalAbstract aa : ar) {
            System.out.println(aa.sound());
        }

        // Sticky Polymorphism
        FirstInterface[] ari = {a, b, c, d, e, f};
        for (FirstInterface aa : ari) {
            aa.first();
        }
    }

    // Assignment # 4a
    // Remote
    // VCD Remote, TV Remove, Satellite Remote, AC Remote
    // Fan Remote
    @Override
    public void first() {
        System.out.println("First Dog ... ");
    }

}
