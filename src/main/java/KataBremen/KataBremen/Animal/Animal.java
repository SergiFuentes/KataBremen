package KataBremen.KataBremen.Animal;

public abstract class Animal {
    protected String name;
    protected String sound;
    protected boolean isSinging = false;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;

    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public boolean isSinging() {
        return isSinging;
    }

    public boolean startSinging() {
        return this.isSinging = true;
    }

    public boolean stopSinging() {
        return this.isSinging = false;
    }


    public String message() {
        if(this.isSinging){
            return "The " + this.name + " is singing " + this.sound;
        } return "The " + this.name + " isn't singing";
    }
}
