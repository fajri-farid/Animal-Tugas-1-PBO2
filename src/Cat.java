public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String n) {
        super(4);
        this.name = n;
    }

    public Cat() {
        this("Kitty");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking on " + legs + " legs");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
