package Adapter.Ducks;

interface Turkey {
    void gobble();

    void fly();
}

class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble-gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying to short distance!");
    }
}
