package java_masterclass.OOPPart2.OOPMasterChallenge;

public class HealthyBurger extends Hamburger {

// fields

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

// constructor

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

// methods

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override                                               // itemize 2 additional items is this class
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrice = hamburgerPrice + this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            hamburgerPrice = hamburgerPrice + this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
