package Lesson02_hw.Rewards;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new ExpGenerator());
        generatorList.add(new ArmorGenerator());
        generatorList.add(new WeaponGenerator());
        generatorList.add(new LvlGenerator());
        generatorList.add(new FoodGenerator());

        for (int i = 0; i < 10; i++) {

            int index = Math.abs(random.nextInt() % 7);
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();

        }
    }
}

abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();

    }

    public abstract GameItem createItem();

}

interface GameItem {
    void open();
}




