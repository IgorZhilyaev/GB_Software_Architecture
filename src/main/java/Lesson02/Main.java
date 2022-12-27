package Lesson02;

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

        for (int i = 0; i < 10; i++) {

            int index = Math.abs(random.nextInt()%2==0?0:1);
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

class GemGenerator extends ItemGenerator{

    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}

class GoldGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}

class GemReward implements GameItem{

    @Override
    public void open() {
        System.out.println("Gem");
    }
}

class GoldReward implements GameItem {


    @Override
    public void open() {
        System.out.println("Gold");
    }
}
