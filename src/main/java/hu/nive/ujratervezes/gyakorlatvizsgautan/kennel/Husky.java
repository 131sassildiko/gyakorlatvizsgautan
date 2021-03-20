package hu.nive.ujratervezes.gyakorlatvizsgautan.kennel;

public class Husky extends Dog{
    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        increasehappiness(4);

    }

    @Override
    public void play(int hours) {
        increasehappiness(hours*3);

    }
}
