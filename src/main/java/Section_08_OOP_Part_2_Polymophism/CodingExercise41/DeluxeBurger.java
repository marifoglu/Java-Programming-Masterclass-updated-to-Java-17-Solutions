package Section_08_OOP_Part_2_Polymophism.CodingExercise41;

class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        addHamburgerAddition1("Chips", 2.75);
        addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}