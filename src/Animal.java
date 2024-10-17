public class Animal {
    protected int legs;

    protected Animal(int x) {
        this.legs = x;
    }

    public void walk() {
        System.out.println("Animal is Walking");
    }

    public void eat() {
        System.out.println("Eating... nyum.. nyum...");
    }
}
