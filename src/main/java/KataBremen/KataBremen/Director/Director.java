package KataBremen.KataBremen.Director;
import KataBremen.KataBremen.Animal.Animal;
import KataBremen.KataBremen.ISingers;

import java.util.ArrayList;


public class Director {

    private ArrayList <ISingers> chorus;

    public Director(ArrayList<ISingers> chorus) {
        this.chorus = chorus;
        this.orderStartSingChorus();
        this.orderStopSingChorus();
    }

    public Director() {
    }

    public ArrayList getChorus() {
        return this.chorus;
    }

    public void orderStartSingChorus() {
            for (ISingers singer : chorus) {
                singer.startSinging();
            };
    }

    public void orderStopSingChorus() {
        for (ISingers singer : chorus) {
            singer.stopSinging();
        };
    }
}
