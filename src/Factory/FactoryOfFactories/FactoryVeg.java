package Factory.FactoryOfFactories;

class FactoryVeg implements IFactory {

    @Override
    public IPizza create(pizzaType type) {
        return switch (type) {
            case A -> new PizzaAVeg();
            case B -> new PizzaBVeg();
            case C -> new PizzaCVeg();
        };
    }
}
