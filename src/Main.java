public class Main {
    public static void main(String[] args) {
        // Cat
        System.out.println("Cat class:");
        Cat myCat = new Cat();
        System.out.println("myCat name: " + myCat.getName());
        myCat.play();
        myCat.eat();
        String oldNameCat = myCat.getName();
        System.out.println("Changing cat's name");
        myCat.setName("Fajri");
        System.out.println("The cat's name changed from " + oldNameCat + " to " + myCat.getName());
        myCat.eat();
        myCat.play();
        myCat.walk();
        System.out.println("\n");

        // Spider
        System.out.println("Spider class:");
        Spider theSpider = new Spider();
        theSpider.eat();
        theSpider.walk();
        System.out.println("\n");

        // Fish
        System.out.println("Fish class:");
        Fish myFish = new Fish();
        System.out.println("myFish name: " + myFish.getName());
        System.out.println("Changing cat's name");
        String oldNameFish = myFish.getName();
        myFish.setName("Lala");
        System.out.println("The fish's name changed from " + oldNameFish + " to " + myFish.getName());
        myFish.eat();
        myFish.play();
        myFish.walk();
    }
}