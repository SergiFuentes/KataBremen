package KataBremen.KataBremen.ComicCharcaterTest;
import KataBremen.KataBremen.Animal.Cat;
import KataBremen.KataBremen.Animal.Donkey;
import KataBremen.KataBremen.ComicCharcater.ComicCharacter;
import KataBremen.KataBremen.Director.Director;
import KataBremen.KataBremen.ISingers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ComicCharacterTest {
    private ArrayList<ISingers> chorus = new ArrayList();

    @Test
    void chorusCanHaveComicSingers(){
        Cat cat = new Cat("Garfield", "miau");
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        ComicCharacter superMan = new ComicCharacter();
        this.chorus.add(cat);
        this.chorus.add(donkey);
        this.chorus.add(superMan);
        assertThat(chorus.size(), equalTo(3));
        assertThat(("The cat Garfield isn't singing"), equalTo(chorus.get(0).message()));
        assertThat(("The donkey Mariano isn't singing"), equalTo(chorus.get(1).message()));
        assertThat((null), equalTo(chorus.get(2).message()));
    }
    @Test
    void directorCanOrderToStartSingingChorusYet(){
        Director director = new Director(chorus);
        Cat cat = new Cat("Garfield", "miau");
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        ComicCharacter superMan = new ComicCharacter();
        this.chorus.add(cat);
        this.chorus.add(donkey);
        this.chorus.add(superMan);

        director.orderStartSingChorus();

        assertThat(cat.isSinging(), equalTo(true));
        assertThat(donkey.isSinging(), equalTo(true));
        assertThat(superMan.isSinging(), equalTo(true));
    }

    @Test
    void directorCanOrderToStopSingingChorusYet(){
        Director director = new Director(chorus);
        Cat cat = new Cat("Garfield", "miau");
        Donkey donkey = new Donkey("Mariano", "ooooiooooi");
        ComicCharacter superMan = new ComicCharacter();
        this.chorus.add(cat);
        this.chorus.add(donkey);
        this.chorus.add(superMan);

        director.orderStartSingChorus();
        director.orderStopSingChorus();
        assertThat(cat.isSinging(), equalTo(false));
        assertThat(donkey.isSinging(), equalTo(false));
        assertThat(superMan.isSinging(), equalTo(false));
    }
}
