package Model;

import java.util.*;

public class Store {
    private List<Toy> toys = new ArrayList<Toy>();

    public void newToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getToy(int id) {
        if (id >= 0 && toys.contains(toys.get(id))) 
            return toys.get(id);
        return null;
    }

}