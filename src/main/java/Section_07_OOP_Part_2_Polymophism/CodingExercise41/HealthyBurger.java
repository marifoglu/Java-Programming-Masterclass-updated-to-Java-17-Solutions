package src.main.java.Section_07_OOP_Part_2_Polymophism.CodingExercise41;

class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            totalPrice += healthyExtra1Price;
        }

        if (healthyExtra2Name != null) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            totalPrice += healthyExtra2Price;
        }

        return totalPrice;
    }
}