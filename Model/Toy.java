package Model;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private int chance;

    public Toy(int id, String name, int quantity, int chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public int getChance() {
        return chance;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

}

