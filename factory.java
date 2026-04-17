interface Burger {
    void prepare();
}

class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger");
    }
}

class ChickenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }
}


abstract class BurgerFactory{
    abstract Burger createBurger();
    void orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
     
    }
}

class VeggieBurgerFactory extends BurgerFactory{
    @Override
    Burger createBurger() {
        return new VeggieBurger();
    }
}   

class ChickenBurgerFactory extends BurgerFactory{
    @Override
    Burger createBurger() {
        return new ChickenBurger();
    }
}



public class factory {
    public static void main(String[] args) {
        BurgerFactory veggieFactory = new VeggieBurgerFactory();
        veggieFactory.orderBurger();

        BurgerFactory chickenFactory = new ChickenBurgerFactory();
        chickenFactory.orderBurger();
    }
}