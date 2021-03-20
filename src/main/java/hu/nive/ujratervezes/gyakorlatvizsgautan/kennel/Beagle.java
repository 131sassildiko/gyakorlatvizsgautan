package hu.nive.ujratervezes.gyakorlatvizsgautan.kennel;

public class Beagle extends Dog {
    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        increasehappiness(2);

    }

    @Override
    public void play(int hours) {
        increasehappiness(hours * 2);
    }
}


