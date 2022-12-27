package Lesson02_hw.Rewards;


public class Rewards {

}

class GemGenerator extends ItemGenerator {

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

class ExpGenerator extends ItemGenerator {


    @Override
    public GameItem createItem() {
        return new ExpReward();
    }
}
class ArmorGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new ArmorReward();
    }
}
class WeaponGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new WeaponReward();
    }
}
class LvlGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new LvlReward();
    }
}
class FoodGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new FoodReward();
    }
}

class GemReward implements GameItem {

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
class ExpReward implements GameItem {


    @Override
    public void open() {
        System.out.println("Experience");
    }
}
class ArmorReward implements GameItem {

    @Override
    public void open() {
        System.out.println("Armor");
    }
}
class WeaponReward implements GameItem {


    @Override
    public void open() {
        System.out.println("Weapon");
    }
}
class LvlReward implements GameItem {


    @Override
    public void open() {
        System.out.println("LvlUp");
    }
}
class FoodReward implements GameItem {


    @Override
    public void open() {
        System.out.println("Food");
    }
}


