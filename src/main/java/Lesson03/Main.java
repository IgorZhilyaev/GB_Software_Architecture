package Lesson03;
// 1. Спроектировать абстрактный класс «Car» у которого должны быть
// свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива,
// тип коробки передач, объём двигателя; методы: движение, обслуживание,
// переключение передач, включение фар, включение дворников.

// 2. Создать конкретный автомобиль путём наследования класса «Car».

// 3. Расширить абстрактный класс «Car», добавить метод: подметать улицу. Создать конкретный автомобиль
// путём наследования класса «Car». Провести проверку принципа SRP.

// 4. Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка груза.
// Провести проверку принципа OCP.

// 5. Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3.
// Провести проверку принципа LSP.

// 6. Создать конкретный автомобиль путём наследования класса «Car», определить метод «движение» - «полёт».
// Провести проверку принципа LSP.

// 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.

// 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».

// 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла, протирка фар, протирка зеркал.

// 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс «Car».
// Провести проверку принципа ISP. Создать дополнительный/е интерфейсы и имплементировать их
// в конкретный класс «Car». Провести проверку принципа ISP.

// 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями,
// имплементировать метод «Заправка топливом» интерфейса «Заправочная станция».
// Реализовать заправку каждого автомобиля подходящим топливом. Провести проверку принципа DIP.


import java.awt.*;

public class Main {
    public static void main(String[] args) {

    }
}

enum TypeCar {SEDAN, PICKUP} //тип кузова

enum TypeFuel {GASOLINE, DIESEL, ELECTRICITY} //тип топлива

enum TypeGearBox {MT, AT} // тип коробки передач

/**
 * абстрактный класс автомобиль
 */
abstract class Car {

    private String make; // марка
    private String model; // модель
    private Color color; // цвет
    private TypeCar bodyType; // тип кузова
    private int numberWheels; // количество колёс
    private TypeFuel fuelType; // тип топлива
    private TypeGearBox gearBoxType; // тип коробки передач
    private double engineCapacity; //

    /**
     * движение
     */
    public void movement() {
    }

    /**
     * обслуживание
     */
    public void maintenance() {
    }

    /**
     * переключение передач
     */
    public boolean gearShifting() {
        return true;
    }

    /**
     * включение фар
     */
    public boolean switchHeadLights() {
        return true;
    }

    /**
     * включение дворников
     */
    public boolean switchWipers() {
        return true;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

/**
 * уборочная машина
 */
class SweepCar extends Car {
    public void sweeping() {
    }
}

/**
 * заправочная станция
 */
interface iRefueling {
    void fuel(TypeFuel typeFuel);

}

/**
 * протирка автомобиля
 */
interface iWipe {
    void wipWindshield();

    void wipHeadlights();

    void wipMirrors();
}

/**
 * конкретный автомобиль
 */
class PickUp extends Car implements iRefueling, iWipe {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void fuel(TypeFuel typeFuel) {
        typeFuel = TypeFuel.GASOLINE;
    }
}

/**
 * автомобиль будущего
 */
class FutureCar extends Car {
    //FutureCar(){this.setNumberWheels(3);}
    private void Fly() {
    }
}

/**
 * дизельный автомобиль
 */
class DieselCar extends Car implements iRefueling{

    DieselCar() {
        this.setFuelType(TypeFuel.DIESEL);
    }

    /**
     * заправка дизельным топливом
     * @param typeFuel
     */
    @Override
    public void fuel(TypeFuel typeFuel) {
        typeFuel = TypeFuel.DIESEL;
    }
}

/**
 * бензиноввый автомобиль
 */
class GasolineCar extends Car implements iRefueling{

    GasolineCar() {
        this.setFuelType(TypeFuel.GASOLINE);
    }

    /**
     * заправка бензином
     * @param typeFuel
     */
    @Override
    public void fuel(TypeFuel typeFuel) {
        typeFuel = TypeFuel.GASOLINE;
    }
}
