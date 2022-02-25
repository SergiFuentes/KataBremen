package KataBremen.KataBremen.AnimalTest;

import KataBremen.KataBremen.Animal.Cat;
import KataBremen.KataBremen.Animal.Donkey;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BremenAnimalTest {
    @Test
    void canCreateAnAnimal(){
        Cat cat = new Cat("cat", "miau");
        assertThat((cat.getName()), equalTo("cat"));
        assertThat((cat.getSound()), equalTo("miau"));
    }
    @Test
    void catCanSing (){
        Cat cat = new Cat("cat", "miau");
        assertFalse(cat.isSinging());
    }
    @Test
    void catCanStartSinging(){
        Cat cat = new Cat("cat", "miau");
        cat.startSinging();
        assertTrue(cat.isSinging());
    }
    @Test
    void catCanStopSinging (){
        Cat cat = new Cat("cat", "miau");
        cat.startSinging();
        cat.stopSinging();
        assertFalse(cat.isSinging());
    }
    @Test
    void whenCatSingSendsASingingMessage(){
        Cat cat = new Cat("Ramon", "miau");
        cat.startSinging();

        assertThat(cat.message(), equalTo("The cat Ramon is singing miau"));
    }

    @Test
    void whenCatIsNotSingSendsANotSingingMessage(){
        Cat cat = new Cat("Ramon", "miau");

        assertThat(cat.message(), equalTo("The cat Ramon isn't singing"));
    }

    @Test
    void whenDonkeySingSendsASingingMessage(){
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        donkey.startSinging();

        assertThat(donkey.message(), equalTo("The donkey Mariano is singing ooooiooooi"));
    }

    @Test
    void whenDonkeyIsNotSingSendsANotSingingMessage(){
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");

        assertThat(donkey.message(), equalTo("The donkey Mariano isn't singing"));
    }
}
