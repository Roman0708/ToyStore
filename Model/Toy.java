package Model;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private float chance;

    public Toy(int id, String name, int quantity, float chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public float getChance() {
        return chance;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public void increaseQuantity(int amount) {
        if (amount>0) {
            this.quantity += amount;
        }
        else System.out.println("Введите целое положительно число");; //Добавить обработку некорректного ввода
    }

}

