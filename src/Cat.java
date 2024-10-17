public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String n) {
        super(4);
        this.name = n;
    }

    public Cat() {
        super(4);
        this.name = "kitty";
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
        System.out.println(name + "is playing");
    }

    // untuk eat dia ngikut parentnya!
}
