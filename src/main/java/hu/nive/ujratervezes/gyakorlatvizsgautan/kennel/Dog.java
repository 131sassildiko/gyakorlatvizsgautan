package hu.nive.ujratervezes.gyakorlatvizsgautan.kennel;

public abstract class Dog {

    private String name;
    private int happiness;

    public Dog(String name) {
        this.name = name;
    }
    protected void increasehappiness (int diff) {
        happiness +=diff;
    }

    public  abstract void feed ();
    public  abstract void play (int hours) ;

    public String getName() {
        return name;
    }
    public int getHappiness() {
        return happiness;
    }
}
