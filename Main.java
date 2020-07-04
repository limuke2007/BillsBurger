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
        db.addHamburgerAddition3("Should not do this", 50.53); //

        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());


    }

}
