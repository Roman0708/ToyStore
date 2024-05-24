package Model;

import java.util.*;

public class Store {
    private List<Toy> toys = new ArrayList<>();

    public void newToy(Toy toy) {
        toys.add(toy);
    }

}