package Controller;

import java.util.Random;

import Model.Store;
import Model.Toy;

public class Controller {

    private Store store;
    private Random random;

    public void ToyMachine(Store store) {
        this.store = store;
        random = new Random();
    }

    public Toy tryWinToyById(int id) {
        float chanceToWIn = random.nextFloat(); // Текущий шанс выиграть конкретную игрушку
        Toy toy = store.getToy(id);
        if (toy.getChance()>chanceToWIn) {
            return toy; // Добавит обработку отсутсвующей игрушки
        }
        else return null; // Добавить обработку проигрыша
    }

    public void run() {
        System.out.println("Start");
    }
}
