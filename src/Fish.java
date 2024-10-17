public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
        this.name = "Nemo";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public void play() {
        System.out.println(name + "is playing");
    }

    public void walk() {
        System.out.println("Fish can not walk");
    }

    // untuk eat dia ngikut parentnya!
}
