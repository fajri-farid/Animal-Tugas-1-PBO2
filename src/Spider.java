public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Spider is walking on " + legs + " legs");
    }

    @Override
    public void eat() {
        System.out.println("Spider is eating");
    }
}
