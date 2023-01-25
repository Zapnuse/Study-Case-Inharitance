package Pewarisan;

public class Animal {
    protected String name;
    protected String sound;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + " says " + this.sound);
    }
}

