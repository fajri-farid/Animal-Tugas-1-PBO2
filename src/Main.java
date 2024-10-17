public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Cat
        Cat myCat = new Cat();
        myCat.eat();
        myCat.setName("Fajri");
        myCat.eat();
        myCat.play();
        myCat.walk();

        // Spider
        Spider theSpider = new Spider();
        theSpider.eat();

        // Fish
        Fish myFish = new Fish();
        myFish.setName("Lala");
        myFish.eat();
        myFish.play();
        myFish.walk();
    }
}