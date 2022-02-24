package KataBremen.KataBremen.Animal;

public class Cat extends Animal {

    public Cat(String name, String sound) {
        super(name, sound);
    }

    public Cat() {
    }

    public String message() {
        if(this.isSinging){
            return "The cat " + this.name + " is singing " + this.sound;
        } return "The cat " + this.name + " isn't singing";
    }
}
