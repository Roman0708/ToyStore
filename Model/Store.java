package Model;

import java.util.*;

public class Store {
    private List<Toy> toys = new ArrayList<Toy>();

    // Нужно ли это?
    public void newToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getToy(int id) {
        if (id >= 0 && toys.contains(toys.get(id))) 
            return toys.get(id);
        return null;
    }

    @SuppressWarnings("unlikely-arg-type")
    public void addToy(Toy toy) {
        if (toys.contains(toy.getId())) { // Существует ли уже такая игрушка 
            toys.get(toy.getId()).increaseQuantity(toy.getQuantity());
        }
        else {
            toys.add(toy);
        }
    }

}