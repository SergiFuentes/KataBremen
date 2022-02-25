package KataBremen.KataBremen.DirectorTest;
import KataBremen.KataBremen.Animal.Animal;
import KataBremen.KataBremen.Animal.Cat;
import KataBremen.KataBremen.Animal.Donkey;
import KataBremen.KataBremen.Director.Director;
import KataBremen.KataBremen.ISingers;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;



public class BremenDirectorTest {
    private ArrayList<ISingers> chorus = new ArrayList();

    @Test
    void aDirectorHaveAChorus(){
        Director director = new Director(chorus);

        assertThat(director.getChorus(), equalTo(chorus));
    }

    @Test
    void theChorusCanHaveAnimals(){
        Cat cat = new Cat("Garfield", "miau");
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        this.chorus.add(cat);
        this.chorus.add(donkey);
        assertThat(chorus.size(), equalTo(2));
        assertThat(("The cat Garfield isn't singing"), equalTo(chorus.get(0).message()));
        assertThat(("The donkey Mariano isn't singing"), equalTo(chorus.get(1).message()));
    }

    @Test
    void theDirectorCanOrderSingToChorus(){
        Director director = new Director(chorus);
        Cat cat = new Cat("Garfield", "miau");
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        this.chorus.add(cat);
        this.chorus.add(donkey);

        director.orderStartSingChorus();

        assertThat(cat.isSinging(), equalTo(true));
        assertThat(("The cat Garfield is singing miau"), equalTo(chorus.get(0).message()));
        assertThat(("The donkey Mariano is singing ooooiooooi"), equalTo(chorus.get(1).message()));
    }

    @Test
    void theDirectorCanOrderStopSingToChorus(){
        Director director = new Director(chorus);
        Cat cat = new Cat("Garfield", "miau");
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        this.chorus.add(cat);
        this.chorus.add(donkey);

        director.orderStopSingChorus();

        assertThat(cat.isSinging(), equalTo(false));
        assertThat(("The cat Garfield isn't singing"), equalTo(chorus.get(0).message()));
        assertThat(("The donkey Mariano isn't singing"), equalTo(chorus.get(1).message()));
    }

}
