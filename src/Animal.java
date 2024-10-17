abstract class Animal {
    protected int legs;

    protected Animal(int x) {
        this.legs = x;
    }

    public abstract void walk();
    public abstract void eat();
}
