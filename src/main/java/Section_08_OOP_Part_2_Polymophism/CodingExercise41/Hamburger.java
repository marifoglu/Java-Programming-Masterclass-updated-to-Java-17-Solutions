package Section_08_OOP_Part_2_Polymophism.CodingExercise41;

class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = price;
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" hamburger on a ").append(breadRollType).append(" roll with ")
                .append(meat).append(", price is ").append(price);

        if (addition1Name != null) {
            sb.append("\nAdded ").append(addition1Name).append(" for an extra ").append(addition1Price);
            totalPrice += addition1Price;
        }

        if (addition2Name != null) {
            sb.append("\nAdded ").append(addition2Name).append(" for an extra ").append(addition2Price);
            totalPrice += addition2Price;
        }

        if (addition3Name != null) {
            sb.append("\nAdded ").append(addition3Name).append(" for an extra ").append(addition3Price);
            totalPrice += addition3Price;
        }

        if (addition4Name != null) {
            sb.append("\nAdded ").append(addition4Name).append(" for an extra ").append(addition4Price);
            totalPrice += addition4Price;
        }

        System.out.println(sb);
        return totalPrice;
    }
}