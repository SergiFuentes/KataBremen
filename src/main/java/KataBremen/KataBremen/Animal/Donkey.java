package KataBremen.KataBremen.Animal;

public class Donkey extends Animal{

        public Donkey(String name, String sound) {
            super(name, sound);
        }

        public Donkey() {
        }

        public String message() {
            if(this.isSinging){
                return "The donkey " + this.name + " is singing " + this.sound;
            } return "The donkey " + this.name + " isn't singing";
        }
}
