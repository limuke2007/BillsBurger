package java_masterclass.OOPPart2.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger {

// fields                   // no extra items allows in this class, comes with "chips" and "drink" automatically

// constructor

    public DeluxeBurger() {
        super("Deluxe", "Chicken & Steak", 12.45, "White");
        super.addHamburgerAddition1("Chips", 1.75);                         // automatically add "chips" and "drink"
        super.addHamburgerAddition2("Drink", 1.83);
    }

// methods

    @Override                                                               // prevent other additions
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
