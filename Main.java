package java_masterclass.OOPPart2.OOPMasterChallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger h = new Hamburger("Basic", "Chicken", 3.56, "White");
        h.addHamburgerAddition1("Lettuce", 0.27);
        h.addHamburgerAddition2("Tomato", 0.75);
        h.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + h.itemizeHamburger());
        System.out.println("<-------------------------------------->");


        HealthyBurger hb = new HealthyBurger("Steak", 5.67);
        hb.addHamburgerAddition1("Egg", 5.43);
        hb.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + hb.itemizeHamburger());
        System.out.println("<-------------------------------------->");


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53); // prevent other additions
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}

// Basic hamburger  on a White roll with Chicken, price is 3.56
// Added Lettuce for an extra 0.27
// Added Tomato for an extra 0.75
// Added Cheese for an extra 1.13
// Total Burger price is 5.71
// <-------------------------------------->
// Healthy hamburger  on a Brown rye roll with Steak, price is 5.67
// Added Egg for an extra 5.43
// Added Lentils for an extra 3.41
// Total Healthy Burger price is 14.51
// <-------------------------------------->
// Cannot add additional items to a deluxe burger
// Deluxe hamburger  on a White roll with Chicken & Steak, price is 12.45
// Added Chips for an extra 1.75
// Added Drink for an extra 1.83
// Total Deluxe Burger price is 16.03