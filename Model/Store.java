package Model;

import java.util.*;

public class Store {
    private List<Toy> toys = new List<Toy>();

    public void newToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getToy(int id) {
        if (id >= 0 && toys.contains(toys[id])) 
            return toys.get(id);
        return null;
    }

}